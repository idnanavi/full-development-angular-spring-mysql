import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  selectedFile;
  imgURL:any;
  receivedImageData:any;
  base64Data:any;
  convertedImage:any;
  constructor(private http:HttpClient){ }
  onFileChanged(event){
    console.log(event);
    this.selectedFile = event.target.files[0];

    let reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event2) => {
      this.imgURL = reader.result;
    }
  }
  onUpload(){
    const uploadData = new FormData();
    uploadData.append('myFile',this.selectedFile,this.selectedFile.name);
    this.http.post('http://localhost:7073/check/upload',uploadData).subscribe(
      res => {
        this.receivedImageData = res;
        this.base64Data = this.receivedImageData.pic;
        this.convertedImage = 'data:image/jpeg;base64,' + this.base64Data;
      }
     
    );
  }
  
}

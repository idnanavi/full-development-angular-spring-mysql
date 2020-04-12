import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  employee : Employee = new Employee();
  submitted = false;
  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }
  save(){
    this.api.createEmployee(this.employee).subscribe(data => console.log(data), error => console.log(error));
    this.employee = new Employee();
  }
  onSubmit(){
    this.submitted = true;
    this.save();
  }
}

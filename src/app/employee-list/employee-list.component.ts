import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../Employee';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
employee : Observable<Employee[]>;
  constructor(private api:ApiService) { }
  ngOnInit(): void {
   this.reloadData();
  }
  reloadData(){
    this.employee = this.api.getEmployeesList();
  }
}

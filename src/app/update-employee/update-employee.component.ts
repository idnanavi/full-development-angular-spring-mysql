import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  employee : Employee = new Employee();
  constructor(private api :ApiService) { }

  ngOnInit(): void {
  }
  onUpdate(id : number){
    this.api.updateEmployee(id,this.employee).subscribe();
    this.employee = new Employee();
  }

}

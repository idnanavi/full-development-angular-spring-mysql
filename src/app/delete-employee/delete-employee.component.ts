import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {
  employee : Employee = new Employee();
  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }
  deleteEmployee(id: number) {
    this.api.deleteEmployee(id).subscribe();
    this.employee = new Employee();
  }
}

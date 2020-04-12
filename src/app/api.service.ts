import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
private url = 'http://localhost:7070/employees';
  constructor(private http:HttpClient) { }
  getEmployeesList(): Observable<any>{
    return this.http.get(this.url);
  }
  createEmployee(employee: Object): Observable<Object> {
    return this.http.post(this.url,employee);
  }
  deleteEmployee(id:number):Observable<any>{
    return this.http.delete(`${this.url}/${id}`);
  }
  updateEmployee(id:number,employee:Object):Observable<Object>{
    return this.http.put(`${this.url}/${id}`, employee);
  }

}

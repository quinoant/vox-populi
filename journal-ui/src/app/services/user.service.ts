import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
//import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type' : 'application/json' })
}
@Injectable()
export class UserService {

  constructor(private http:HttpClient) { }
  getUsers() {
    return this.http.get('server/api/v1/users');
  }
}

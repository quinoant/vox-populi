import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public journals;

  constructor(private userService: UserService)  { }

  ngOnInit(): void {
    this.getJournals();
  }

  getJournals() {
    this.userService.getUsers().subscribe(
      data => {this.journals = data},
      err => console.error(err),
      () => console.log('journals loaded') 
    )
  }

}

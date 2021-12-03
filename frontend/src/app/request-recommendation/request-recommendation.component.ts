import { Component, OnInit } from '@angular/core';
import { RequestserviceService } from '../requestservice.service';
import { User } from '../user';

@Component({
  selector: 'app-request-recommendation',
  templateUrl: './request-recommendation.component.html',
  styleUrls: ['./request-recommendation.component.css']
})
export class RequestRecommendationComponent implements OnInit {
  user:User=new User();
  constructor(private requestService: RequestserviceService ) {

  }

  ngOnInit(): void {
  }
  userRequest(){
    console.log(this.user);
    this.requestService.registerUser(this.user).subscribe(data=>{
      alert("Successfull request is Submitted?")},error=>alert("Sorry something went wrong"));
    }
  }


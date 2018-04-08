import { Component, OnInit } from '@angular/core';
import { ClassificationService } from '../classification.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-applicationform',
  templateUrl: './applicationform.component.html',
  styleUrls: ['./applicationform.component.css']
})
export class ApplicationformComponent implements OnInit {

  public company:string[];
  public classificationData:string;
  constructor(private classificationService:ClassificationService,private http: HttpClient) { }

  ngOnInit() {
    this.classificationService.getClassifications;
    this.classificationData = this.classificationService.classificationData;
    console.log(this.classificationData);
    this.company = this.classificationService.company;
    console.log(this.company);
  }

}

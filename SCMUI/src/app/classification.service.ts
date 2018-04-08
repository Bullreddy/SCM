import { Injectable } from '@angular/core';
//import { Http,Responcse} from '@angular/http'
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ClassificationService {
tring;
  public classificationData: string;
  constructor(private http:HttpClient) {
    this.getClassifications();
  }


  company = [
      'Ford','Chevrolet','Buick'
    ];

  getClassifications() {
       this.http.get('http://localhost:8080/getConfigurations').subscribe(res => {
       this.classificationData = JSON.stringify(res);
      // console.log(this.classificationData);
    });
    return this.classificationData;
  }

}

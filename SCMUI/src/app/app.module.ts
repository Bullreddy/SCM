import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { ApplicationformComponent } from './applicationform/applicationform.component';
import { RouterModule } from '@angular/router';
import { ClassificationService } from './classification.service'
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,ApplicationformComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: 'applicationform',
        component: ApplicationformComponent
      }
    ])
  ],
  providers: [ClassificationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
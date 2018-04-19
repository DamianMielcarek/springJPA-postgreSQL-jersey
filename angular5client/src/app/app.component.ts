import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { Topic } from './topic';
import { TopicService } from './topic.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'app';
  topicsList = [];

  constructor(private topicService: TopicService) { }

  getSomething() {
    this.topicService.getAllTopics().subscribe(
      data => {
        this.topicsList = data;
      }
    );
  }

  ngOnInit() {
    this.getSomething();
  }

  logTopics() {
    console.log(this.topicsList.length);
  }
}

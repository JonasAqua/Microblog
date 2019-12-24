import { Component } from '@angular/core';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.scss']
})
export class PostComponent {
  examplePost;

  constructor() {
    this.examplePost = {
      title: "Lorem Ipsum",
      content: "This is the content of the post!"
    }
  }
}

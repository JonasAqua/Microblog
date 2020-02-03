import { Component } from '@angular/core';
import { PostService, Post } from '../post.service';

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.scss']
})
export class PostListComponent {
  constructor(private postService: PostService) {}

  showPosts() {
    console.log('Showing posts...')
    this.postService.getAllPosts()
      .subscribe((data: Post[]) => console.log(data))
  }
}

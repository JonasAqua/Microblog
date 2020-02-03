import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

export interface Post {
    id: String,
    title: String,
    date: String,
    content: String
}

@Injectable()
export class PostService {
    constructor(private http: HttpClient) { }

    getAllPosts() {
        return this.http.get("http://localhost:3000/entry");
    }
}

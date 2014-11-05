/*
 * Copyright 2013 eXo Platform SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.juzu.tutorial.models;

import java.util.LinkedList;
import java.util.List;

public class Secret extends Model {

  private static final long serialVersionUID = 9216333356065206889L;

  private String message;

  private String imageURL;
  
  private List<String> likes;
  
  private List<Comment> comments;

  public Secret() {
    likes = new LinkedList<String>();    
    comments = new LinkedList<Comment>();
  }

  public List<String> getLikes() {
    List<String> lks = new LinkedList<String>(likes);
    return lks;
  }

  public void setLikes(List<String> likes) {
    this.likes = likes;
  }

  public List<Comment> getComments() {
    List<Comment> cms = new LinkedList<Comment>(comments);
    return cms;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }
}

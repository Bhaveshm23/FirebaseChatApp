/**
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.udacity.friendlychat;

public class FriendlyMessage {

    private String text;
    private String name;
    private String photoUrl;
    private String imageName;
    String timestamp;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoUrl,String imageName,String timestamp) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
       this.imageName=imageName;
       this.timestamp=timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
      //  this.imageName=name;
    }

    public String getImageName()
    {
        return imageName;
    }

    public void setImageName(String imageName)
    {
        this.imageName=imageName;
    }
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }


    public String getTimestamp(){return timestamp;}

    public void setTimestamp(){
        this.timestamp=timestamp;
    }
}

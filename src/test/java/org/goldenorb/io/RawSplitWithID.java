/**
 * Licensed to Ravel, Inc. under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Ravel, Inc. licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package org.goldenorb.io;

import org.goldenorb.io.input.RawSplit;

public class RawSplitWithID extends RawSplit{
  
  private String ID;
  
/**
 * Constructor
 *
 * @param  String ID
 * @param  String[] locations
 */
  public RawSplitWithID(String ID, String[] locations){
    this.ID = ID;
    setLocations(locations);
  }

/**
 * Set the iD
 * @param  String iD
 */
  public void setID(String iD) {
    ID = iD;
  }

/**
 * Return the iD
 */
  public String getID() {
    return ID;
  }
  
/**
 * 
 * @returns String
 */
  @Override
  public String toString(){
    StringBuilder locationString = new StringBuilder();
    for(String location: getLocations()){
      locationString.append(location);
      locationString.append(", ");
    }
    return ID + " : " + locationString.toString();
  }
}

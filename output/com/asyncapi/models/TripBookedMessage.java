
/*
* (c) Copyright IBM Corporation 2021
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
package com.asyncapi.models;
  
import com.asyncapi.models.ModelContract;
import java.util.UUID;
public class TripBookedMessage  extends ModelContract{
  public String startDate;
  public String endDate;
  public int guestId;
  public int vehicleId;
  public TripBookedMessage(String startDate,String endDate,int guestId,int vehicleId) {
    
    this.startDate = startDate;
    
    this.endDate = endDate;
    
    this.guestId = guestId;
    
    this.vehicleId = vehicleId;
    
  }
  public TripBookedMessage() {
    super();
  }
  public String toString() {
    return "TripBooked,guest:" + String.valueOf(this.guestId) + ",vehicle:" + String.valueOf(this.vehicleId);
  }
}

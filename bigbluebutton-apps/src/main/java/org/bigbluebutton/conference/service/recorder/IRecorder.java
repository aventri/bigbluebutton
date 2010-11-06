/** 
* ===License Header===
*
* BigBlueButton open source conferencing system - http://www.bigbluebutton.org/
*
* Copyright (c) 2010 BigBlueButton Inc. and by respective authors (see below).
*
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License as published by the Free Software
* Foundation; either version 2.1 of the License, or (at your option) any later
* version.
*
* BigBlueButton is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License along
* with BigBlueButton; if not, see <http://www.gnu.org/licenses/>.
* 
* ===License Header===
*/
package org.bigbluebutton.conference.service.recorder;

import java.util.Hashtable;

/** 
 * 
 * The IRecorder interface define all the neccesary methods to implement for 
 * dispatch events to a JMS queue
 * 
 * */
public interface IRecorder {
	/** 
     * Receive the messages from the bigbluebutton modules and send 
     * them to a JMS queue. These messages are the events generated in a conference.
     * @param message a JSON String message with the attributes of an event 
     */
	public void recordEvent(String message);
	
	/*************************************************
	 * XML Test Performance
	 *******************************************/
	@SuppressWarnings("unchecked")
	public String parseEventsToXML(String module, Hashtable keyvalues);
	
	public String appendXMLToEvent(String xmlevents,String xmlappended,String fromtag);
	
}

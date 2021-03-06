package org.chaverim5t.chaverim.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Models a single dispatched call for assistance.
 *
 * Calls can have multiple status updates, each of which usually has an associated message.
 * Responders can leave voice notes on a call.
 * Responders can cover a call, which is modeled by adding their unit ID string to {@code coverage}.
 */
public class Call {
  public String title;
  public int callNumber;
  public long callId;
  public long createdTimestamp;
  public long updatedTimestamp;
  public String dispatcherName;
  public String callerName;
  public String phoneNumber;
  public String notes;
  public String vehicle;
  public String problem;
  public String area;
  public String status;
  public boolean urgent;
  public String location;

  public ArrayList<VoiceNote> voiceNotes;

  public ArrayList<Message> messages;

  public ArrayList<String> coverage;


  class Message {
    public long timestamp;
    public String message;

    public Message() {}
  }

  public Message newMessage() {
    return new Message();
  }

  public Call() {
    title = "";
    callNumber = 0;
    callerName = "";
    phoneNumber = "";
    callId = 0;
    createdTimestamp = 1234567890123l;
    updatedTimestamp = 1234567890124l;
    dispatcherName = "";
    notes = "";
    vehicle = "";
    location = "";
    problem = "";
    area = "F";
    status = "Open";
    urgent = false;
    voiceNotes = new ArrayList<>();
    messages = new ArrayList<>();
    coverage = new ArrayList<>();
  }

  public Call(String title) {
    this();
    this.title = title;
  }

  public Call(int callNumber, String title) {
    this(title);
    this.callNumber = callNumber;
  }
}

package md.orange.academy.example.patterns.behavioural.concreteobserver;

import md.orange.academy.example.patterns.behavioural.EventType;


/**
 * ConcreteObserver is EmailNotification
 */
public class EmailNotification implements ObserverBase {

  private String email;

  public EmailNotification(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public void update(EventType eventType, String meetingRoomName, String time) {
    System.out.println("Email to " + email + ": Someone has performed " + eventType
        + " operation with the meeting room: " + meetingRoomName + "; at " + time);
  }
}

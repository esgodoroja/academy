package md.orange.academy.example.patterns.behavioural.concreteobserver;

import md.orange.academy.example.patterns.behavioural.EventType;

public class PushNotification implements ObserverBase {

  private String UUID;

  public PushNotification(String UUID) {
    this.UUID = UUID;
  }

  @Override
  public void update(EventType eventType, String meetingRoomName, String time) {
    System.out.println("Push Notification to " + UUID + ": Someone has performed " + eventType
        + " operation with the meeting room: " + meetingRoomName + "; at " + time);
  }
}

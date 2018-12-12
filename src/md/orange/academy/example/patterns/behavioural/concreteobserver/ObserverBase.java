package md.orange.academy.example.patterns.behavioural.concreteobserver;

import md.orange.academy.example.patterns.behavioural.EventType;

public interface ObserverBase {

  void update(EventType eventType, String meetingRoomName, String time);

}

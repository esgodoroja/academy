package md.orange.academy.example.patterns.behavioural;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import md.orange.academy.example.patterns.behavioural.concreteobserver.ObserverBase;

public class SubjectBase {

  Map<EventType, List<ObserverBase>> listeners = new EnumMap<>(EventType.class);

  public SubjectBase() {
    for (EventType e : EventType.values()) {
      listeners.put(e, new ArrayList<>());
    }
  }

  public void subscribe(EventType eventType, ObserverBase listener) {
    List<ObserverBase> users = listeners.get(eventType);
    users.add(listener);
  }

  public void unsubscribe(EventType eventType, ObserverBase listener) {
    List<ObserverBase> users = listeners.get(eventType);
    users.remove(listener);
  }

  public void notify(EventType eventType, String meetingRoomName, String time) {
    List<ObserverBase> users = listeners.get(eventType);
    for (ObserverBase listener : users) {
      listener.update(eventType, meetingRoomName, time);
    }
  }

}

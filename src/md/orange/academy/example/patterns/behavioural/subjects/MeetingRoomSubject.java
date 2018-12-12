package md.orange.academy.example.patterns.behavioural.subjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import md.orange.academy.example.patterns.behavioural.EventType;
import md.orange.academy.example.patterns.behavioural.SubjectBase;

/**
 * ConcreteSubject
 */
public class MeetingRoomSubject {

  public SubjectBase subjectBase;

  private Map<String, List<String>> meetingsAvailable = new HashMap<>();

  public MeetingRoomSubject(String...meetingNames) {
    this.subjectBase = new SubjectBase();
    for (String meetingName: meetingNames) {
      meetingsAvailable.put(meetingName, new ArrayList<>());
    }
  }

  public void reservation(String name, String time) {
    List<String> bookings = meetingsAvailable.get(name);
    if(bookings != null) {
      bookings.add(time);
      subjectBase.notify(EventType.RESERVATION, name, time);
    }
  }

  public void canceling(String name, String time) {
    List<String> bookings = meetingsAvailable.get(name);
    if(bookings != null) {
      bookings.remove(time);
      subjectBase.notify(EventType.CANCELING, name, time);
    }
  }



}

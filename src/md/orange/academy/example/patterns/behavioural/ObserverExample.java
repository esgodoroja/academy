package md.orange.academy.example.patterns.behavioural;

import md.orange.academy.example.patterns.behavioural.concreteobserver.EmailNotification;
import md.orange.academy.example.patterns.behavioural.concreteobserver.PushNotification;
import md.orange.academy.example.patterns.behavioural.subjects.MeetingRoomSubject;

public class ObserverExample {

  public static void main(String[] args) {
    MeetingRoomSubject editor = new MeetingRoomSubject("A", "B", "C");
    EmailNotification emailNotificationObserver = new EmailNotification(
        "example@orange.md");
    editor.subjectBase.subscribe(EventType.RESERVATION, new PushNotification("UUID"));
    editor.subjectBase
        .subscribe(EventType.RESERVATION, emailNotificationObserver);
    editor.subjectBase.subscribe(EventType.CANCELING, emailNotificationObserver);

    editor.reservation("C", "10:00-12:00");
    editor.canceling("C", "10:00-12:00");

    System.out.println("\nunsubscribe: " + emailNotificationObserver.getEmail() + "\n");
    editor.subjectBase.unsubscribe(EventType.CANCELING, emailNotificationObserver);

    editor.reservation("C", "10:00-12:00");
    editor.canceling("C", "10:00-12:00");
  }

}

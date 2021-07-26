package HW_TA_JAVA_2;

public interface Alarm {
    public default void turnAlarmOn(){
        System.out.println("Alarm is on");
    }

    public default void turnAlarmOFF(){
        System.out.println("Alarm is off");
    }

}

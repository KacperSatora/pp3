public class Clock {
    private int hour;
    private int minute;

    @Override
    public String toString() {
        return String.format("%04d", minute);
    }

    // Konstruktor
    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    // Metoda dostępowa do atrybutu hour
    public int getHour() {
        return hour;
    }

    // Metoda modyfikująca atrybut hour
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour value. Hour must be in the range 0 to 23.");
        }
    }

    // Metoda dostępowa do atrybutu minute
    public int getMinute() {
        return minute;
    }

    // Metoda modyfikująca atrybut minute
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid minute value. Minute must be in the range 0 to 59.");
        }
    }

    // Metoda przesuwająca zegar o jedną minutę do przodu
    public void addMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }


    }

    // Przykład użycia
    public static void main(String[] args) {
        Clock myClock = new Clock(12, 30);
        Clock myClock2 = new Clock(25, 61);
        System.out.println("Current time: " + myClock.getHour() + ":" + myClock.getMinute());

        myClock.addMinute();
        System.out.println("Time after adding a minute: " + myClock.getHour() + ":" + myClock.getMinute());

        // Przykład ustawienia nieprawidłowej wartości godziny
        myClock2.setHour(25); // Wyświetli komunikat o błędzie

        System.out.println("Current time: " + myClock2.getHour() + ":" + myClock2.getMinute());

        myClock2.addMinute();
        System.out.println("Time after adding a minute: " + myClock2.getHour() + ":" + myClock2.getMinute());

        // Przykład ustawienia nieprawidłowej wartości godziny
        myClock2.setHour(25); // Wyświetli komunikat o błędzie
        System.out.println(myClock.toString());
    }
}

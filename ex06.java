import java.util.*;

class Location{
    public String name;
    public int latitude, longitude;
    public Location(String name, int a, int b){
        this.name=name;
        this.longitude=a;
        this.latitude=b;
    }
    public String getCity(){
        return name;
    }
    public int getLongitude(){
        return longitude;
    }
    public int getLatitude(){
        return latitude;
    }
}

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Location[] location = new Location[4];
        HashMap<String, Location> info = new HashMap<String, Location>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i = 0; i < location.length; i++) {
            System.out.print(">> ");
            String text = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String city = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());
            location[i] = new Location(city, longitude, latitude);
            info.put(city, location[i]); // ArrayList에 저장
        }
        Set<String> key = info.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("----------------------------------");
        while (it.hasNext()) {
            String city = it.next();
            Location s = info.get(city);
            System.out.println(s.getCity() + " " + s.getLongitude() + " " + s.getLatitude());
        }
        System.out.println("----------------------------------");
        while (true) {
            System.out.print("도시 이름 >> ");
            String city = scanner.next();
            if (city.equals("그만")) break;
            Location s = info.get(city);
            if (s == null)
                System.out.println(city + "는 없습니다.");
            else
                System.out.println(s.getCity() + " " + s.getLongitude() + " " + s.getLatitude());
        }
        scanner.close();
    }
}

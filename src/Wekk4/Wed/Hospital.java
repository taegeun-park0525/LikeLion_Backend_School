package Wekk4.Wed;

public class Hospital {
    public String id;
    public String address;
    public String district;
    public String category;
    public int emergencyRoom;
    public String name;
    public String subdivision;

    public Hospital(String id, String address, String district, String category, int emergencyRoom, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergencyRoom = emergencyRoom;
        this.name = name;
        this.subdivision = subdivision;
    }

    public void setDistrict(String district) {
        String[] splitted = this.address.split(" ");
        this.district = district;
    }

    public static void main(String[] args) {
        Hospital hp = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)",
                "서울특별시 금천구",
                "C",
                2,
                "365병원",
                null
        );
    }
}

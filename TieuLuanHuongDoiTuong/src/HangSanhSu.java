import java.util.Date;

import javax.xml.crypto.Data;

public class HangSanhSu extends HangHoa{
    private String nhaSX;
    private Date ngayNhapKho;
    public HangSanhSu(int maH, int sLTHKK, String tenHH, double donGiaHH, String nhaSX, Date ngayNhapKho) {
        super(maH,sLTHKK, tenHH, donGiaHH);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public HangSanhSu(String nhaSX, Date ngayNhapKho) {
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSX() {
        return nhaSX;
    }
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        if (ngayNhapKho != null) {
            this.ngayNhapKho = ngayNhapKho;
        } else {
            System.out.println("Ngay Khong Duoc De Trong");
        }
    }
    @Override
    public String toString() {
        return super.toString()+"HangSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhaSX=" + nhaSX + "]";
    }
    
}
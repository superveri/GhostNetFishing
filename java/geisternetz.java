import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class GhostNetController {

    private String gpsCoords;
    private String size;
    private String status;

    public String getGpsCoords() {
        return gpsCoords;
    }

    public void setGpsCoords(String gpsCoords) {
        this.gpsCoords = gpsCoords;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void meldGeisternetz() {
        // Hier Code zum Melden eines Geisternetzes
    }

}
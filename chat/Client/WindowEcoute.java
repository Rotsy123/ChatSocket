import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class WindowEcoute implements WindowFocusListener{
    FenetreClient fenetre;

    public FenetreClient getFenetre() {
        return fenetre;
    }
    public void setFenetre(FenetreClient fenetre) {
        this.fenetre = fenetre;
    }

    public WindowEcoute(FenetreClient fenetre){
        this.fenetre = fenetre;
    }
    @Override
    public void windowGainedFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        if (!fenetre.getMsgRec().getText().equals("")) {
            System.out.println("Yes Focus");
            fenetre.getWriter().println( fenetre.getUsername() + ": Focusing to Comunication");
            fenetre.getWriter().flush();
        }
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        // TODO Auto-generated method stub
        if (!fenetre.getMsgRec().getText().equals("")) {
            fenetre.getWriter().println( fenetre.getUsername() + ": Ignoring to Comunication");
            fenetre.getWriter().flush();
        }
    }

    

}
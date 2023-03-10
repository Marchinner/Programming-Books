import javax.swing.JOptionPane;
public class Authenticator {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Nome de Usuário:");
        String password = JOptionPane.showInputDialog("Senha:");

        if (
                username != null && password != null &&
                        ((username.equals("bburd") && password.equals("swordfish")) ||
                                (username.equals("hritter") && password.equals("preakston"))
                        )
        ) {
            JOptionPane.showMessageDialog(null, "Você entrou.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é suspeito!");
        }
    }
}

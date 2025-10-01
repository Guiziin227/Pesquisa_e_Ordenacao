package ordenacoes;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.*;

public class GerenciadorArquivo {
    private List<Integer> numeros;

    public GerenciadorArquivo() {
        this.numeros = new ArrayList<>();
    }

    public boolean carregarArquivo() {
        JFileChooser seletorArquivo = new JFileChooser();
        seletorArquivo.setFileFilter(new FileNameExtensionFilter("Arquivos TXT", "txt"));

        int resultado = seletorArquivo.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivo = seletorArquivo.getSelectedFile();
            return lerArquivo(arquivo);
        }
        return false;
    }

    private boolean lerArquivo(File arquivo) {
        numeros.clear();
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                linha = linha.trim();
                if (!linha.isEmpty()) {
                    try {
                        numeros.add(Integer.parseInt(linha));
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao ler o arquivo: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List<Integer> getNumeros() {
        return new ArrayList<>(numeros);
    }
}
package net.machina.swingdatamgmt;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainFrame extends JFrame implements Runnable {

    private JButton b1;
    private JPanel panelEdit, panelButtons, panelData;
    private JMenuBar menuBar;

    private JMenu menuFile;
    private JMenuItem miClose;

    private JMenu menuHelp;

    // Deklaracje akcji
    private Actions.CloseAction closeAction;

    private ArrayList<Czlowiek> listaLudzi;
    private JScrollPane scrollPane;
    private JTable tablePeople;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width / 2, screenSize.height / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelEdit = new JPanel();
        panelButtons = new JPanel();
        panelData = new JPanel();

        menuBar = new JMenuBar();
        menuFile = new JMenu("Plik");
        menuHelp = new JMenu("Pomoc");

        panelData.setBorder(BorderFactory.createRaisedBevelBorder());
        panelEdit.setBorder(BorderFactory.createRaisedBevelBorder());
        panelButtons.setBorder(BorderFactory.createRaisedBevelBorder());

        panelEdit.setPreferredSize(new Dimension(0,100));
        panelButtons.setPreferredSize(new Dimension(150, 0));

        setJMenuBar(menuBar);
        add(panelEdit, BorderLayout.NORTH);
        add(panelButtons, BorderLayout.WEST);
        add(panelData, BorderLayout.CENTER);

        menuBar.add(menuFile);
        menuBar.add(menuHelp);

        closeAction = new Actions.CloseAction();
        miClose = new JMenuItem(closeAction);
        menuFile.add(miClose);

        listaLudzi = new ArrayList<>();
        initList();


        tablePeople = new JTable(new AbstractTableModel() {
            String[] header = {"Imię", "Nazwisko", "Data urodzenia"};

            @Override
            public String getColumnName(int column) {
                return header[column];
            }

            @Override
            public int getRowCount() {
                return listaLudzi.size();
            }

            @Override
            public int getColumnCount() {
                return 3;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                String ret;
                Czlowiek c = listaLudzi.get(rowIndex);
                switch(columnIndex) {
                    case 0:
                        ret = c.getImie();
                        break;
                    case 1:
                        ret = c.getNazwisko();
                        break;
                    case 2:
                        ret = c.getDataUrodzenia().toString();
                        break;

                        default:
                            ret = "";
                }
                return ret;
            }
        });

        panelData.add(tablePeople);
    }

    @Override
    public void run() {
        setVisible(true);
    }

    private void initList() {
        listaLudzi.add(new Czlowiek("Jan", "Kowalski", LocalDate.of(1987,3,3)));
        listaLudzi.add(new Czlowiek("Maria", "Konopnicka", LocalDate.of(1917,6,12)));
        listaLudzi.add(new Czlowiek("Andrzej", "Iksiński", LocalDate.of(1965,8,27)));
    }
}

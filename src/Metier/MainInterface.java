package Metier;

import DAO.Repository.ConsultationRepository;
import DAO.Repository.MedicamentRepository;
import DAO.Repository.OrdannaceRepository;
import DAO.Repository.PatientRepository;
import Model.Consultation;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;
import javax.swing.border.*;
import javax.swing.table.*;

public class MainInterface extends JFrame {

    private ConsultationRepository consultationRepository;
    private OrdannaceRepository ordannaceRepository;
    private PatientRepository patientRepository;
    private MedicamentRepository medicamentRepository;

    private JButton AddConsulation;
    private JButton AddConsulationButton;
    private JButton AddPatient;
    private JButton AddPatientButton;
    private JLabel AdrLabel;
    private JLabel AjoutOrdonnaceLabel;
    private JLabel AjoutPatientIcon;
    private JLabel AjoutPatientLAbel;
    private JLabel AjouterConsulationLabel;
    private JButton BackDashboard;
    private JLabel Bonjour;
    private JButton ButtonAjouterPatient;
    private JButton ButtonAnnullerrPatient;
    private JPanel CardLayoutDisplayer;
    private JLabel Cnss;
    private JTextField CnssPAtient;
    private JLabel CodePostalLabel;
    private JLabel ConsulatationLAbel;
    private JButton ConsulationButton;
    private JPanel ConsulationCard;
    private JLabel ConsulationIcon;
    private JLabel ConsulationLabel;
    private JLabel ConsulationsIcon;
    private JPanel ConsultationPanel;
    private JPanel DashboardPanel;
    private JLabel DateCons;
    private JFormattedTextField DateConsulation;
    private JLabel DosageLabel;
    private JTextField Dtn;
    private JLabel DtnLabel;
    private JLabel GestionPatientIcon;
    private JLabel GestionPatientLabel;
    private JLabel GroupSang;
    private JTextField GroupSangLAbel;
    private JPanel HomePanel;
    private JLabel Icon2;
    private JLabel IconConsulation;
    private JLabel InfoPerso;
    private JPanel LeftSideMain;
    private JPanel LeftSideMain1;
    private JLabel ListeConsulation;
    private JLabel ListePatient;
    private JScrollPane ListePatientScrolBar;
    private JScrollPane ListePatientScrolBar1;
    private JPanel LogoPanel;
    private JButton LogoutButton;
    private JLabel ModeLabel;
    private JComboBox<String> ModeList;
    private JButton ModifyConsulationtButton;
    private JButton ModifyPatientButton;
    private JLabel NomLabel;
    private JLabel NombreLabel;
    private JPanel OrdonnanceCard;
    private JPanel PAtientCard;
    private JLabel PatientIcon;
    private JLabel PatientLabel;
    private JButton PatientMainButton;
    private JPanel PatientPanel;
    private JPanel PatientPanelMain;
    private JLabel PrenLabel;
    private JLabel Prescreption;
    private JLabel ProfessionLabel;
    private JButton RemoveConsulationButton;
    private JButton RemovePatientButton;
    private JPanel RightSideMMain;
    private JLabel Sexe;
    private JPanel SideBar;
    private JTable TableConsulation;
    private JTable TablePatient;
    private JRadioButton TroisParJour;
    private JLabel TypeCons;
    private JComboBox<String> TypeConsulation;
    private JLabel VilleLAbel;
    private JTextField adr;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JLabel close;
    private JTextField codePosttal;
    private JRadioButton deuxPArJour;
    private JTextField dosage;
    private JTextField email;
    private JLabel emaillabel;
    private JPanel header;
    private JLabel icon;
    private JLabel infoMedica;
    private JLabel jLabel1;
    private JLabel jLabel12;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel22;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel4;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JRadioButton jRadioButton4;
    private JRadioButton jRadioButton5;
    private JButton loginButton;
    private JLabel logo;
    private JPanel medicalinfo;
    private JTextField medicament;
    private JLabel medicamentLabel;
    private JTextField nom;
    private JPanel persoInfo;
    private JTextField pren;
    private JTextField profession;
    private JRadioButton uneParjour;
    private JTextField ville;
    public MainInterface() {
        consultationRepository=new ConsultationRepository();
        ordannaceRepository=new OrdannaceRepository();
        patientRepository=new PatientRepository();
        medicamentRepository=new MedicamentRepository();
        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        DashboardPanel = new JPanel();
        Bonjour = new JLabel();
        CardLayoutDisplayer = new JPanel();
        HomePanel = new JPanel();
        PAtientCard = new JPanel();
        PatientIcon = new JLabel();
        PatientLabel = new JLabel();
        ConsulationCard = new JPanel();
        ConsulatationLAbel = new JLabel();
        ConsulationIcon = new JLabel();
        PatientPanelMain = new JPanel();
        GestionPatientLabel = new JLabel();
        GestionPatientIcon = new JLabel();
        LeftSideMain = new JPanel();
        ListePatient = new JLabel();
        ListePatientScrolBar = new JScrollPane();
        TablePatient = new JTable();
        ModifyPatientButton = new JButton();
        AddPatient = new JButton();
        RemovePatientButton = new JButton();
        RightSideMMain = new JPanel();
        IconConsulation = new JLabel();
        TypeConsulation = new JComboBox<>();
        TypeCons = new JLabel();
        DateCons = new JLabel();
        DateConsulation = new JFormattedTextField();
        AjouterConsulationLabel = new JLabel();
        AddConsulationButton = new JButton();
        PatientPanel = new JPanel();
        AjoutPatientLAbel = new JLabel();
        AjoutPatientIcon = new JLabel();
        persoInfo = new JPanel();
        Icon2 = new JLabel();
        InfoPerso = new JLabel();
        Dtn = new JTextField();
        nom = new JTextField();
        pren = new JTextField();
        NomLabel = new JLabel();
        PrenLabel = new JLabel();
        DtnLabel = new JLabel();
        Sexe = new JLabel();
        jRadioButton4 = new JRadioButton();
        jRadioButton5 = new JRadioButton();
        jLabel42 = new JLabel();
        jLabel43 = new JLabel();
        VilleLAbel = new JLabel();
        ville = new JTextField();
        CodePostalLabel = new JLabel();
        codePosttal = new JTextField();
        AdrLabel = new JLabel();
        adr = new JTextField();
        emaillabel = new JLabel();
        email = new JTextField();
        ProfessionLabel = new JLabel();
        profession = new JTextField();
        medicalinfo = new JPanel();
        infoMedica = new JLabel();
        icon = new JLabel();
        GroupSang = new JLabel();
        GroupSangLAbel = new JTextField();
        Cnss = new JLabel();
        CnssPAtient = new JTextField();
        ButtonAnnullerrPatient = new JButton();
        ButtonAjouterPatient = new JButton();
        ConsultationPanel = new JPanel();
        ConsulationsIcon = new JLabel();
        ConsulationLabel = new JLabel();
        LeftSideMain1 = new JPanel();
        ListeConsulation = new JLabel();
        ListePatientScrolBar1 = new JScrollPane();
        TableConsulation = new JTable();
        ModifyConsulationtButton = new JButton();
        AddConsulation = new JButton();
        RemoveConsulationButton = new JButton();
        OrdonnanceCard = new JPanel();
        AjoutOrdonnaceLabel = new JLabel();
        NombreLabel = new JLabel();
        medicamentLabel = new JLabel();
        DosageLabel = new JLabel();
        dosage = new JTextField();
        uneParjour = new JRadioButton();
        deuxPArJour = new JRadioButton();
        TroisParJour = new JRadioButton();
        ModeList = new JComboBox<>();
        ModeLabel = new JLabel();
        medicament = new JTextField();
        Prescreption = new JLabel();
        loginButton = new JButton();
        SideBar = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        BackDashboard = new JButton();
        jLabel6 = new JLabel();
        PatientMainButton = new JButton();
        jLabel5 = new JLabel();
        AddPatientButton = new JButton();
        jLabel12 = new JLabel();
        ConsulationButton = new JButton();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel22 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        LogoutButton = new JButton();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        header = new JPanel();
        close = new JLabel();
        LogoPanel = new JPanel();
        logo = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new Color(244, 249, 253));
        setFocusable(false);
        setFocusableWindowState(false);
        setUndecorated(true);
        setPreferredSize(new Dimension(1200, 720));

        DashboardPanel.setBackground(new Color(244, 249, 253));
        DashboardPanel.setPreferredSize(new Dimension(1050, 240));
        DashboardPanel.setVerifyInputWhenFocusTarget(false);

        Bonjour.setFont(new Font("Bahnschrift", 1, 53));
        Bonjour.setForeground(new Color(16, 33, 125));
        Bonjour.setHorizontalAlignment(SwingConstants.CENTER);
        Bonjour.setText("Bienvenue");
        Bonjour.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(16, 33, 125)));

        CardLayoutDisplayer.setBackground(new Color(255, 255, 255));
        CardLayoutDisplayer.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));
        CardLayoutDisplayer.setPreferredSize(new Dimension(300, 300));
        CardLayoutDisplayer.setLayout(new CardLayout());

        HomePanel.setBackground(new Color(255, 255, 255));
        HomePanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));
        HomePanel.setPreferredSize(new Dimension(1050, 656));

        PAtientCard.setBackground(new Color(255, 255, 255));
        PAtientCard.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));
        PAtientCard.setPreferredSize(new Dimension(300, 300));

        PatientIcon.setIcon(new ImageIcon(getClass().getResource("../Images/health-insurance (1).png")));

        PatientLabel.setFont(new Font("Bahnschrift", 1, 18));
        PatientLabel.setForeground(new Color(16, 33, 125));
        PatientLabel.setText("Patient");

        GroupLayout PAtientCardLayout = new GroupLayout(PAtientCard);
        PAtientCard.setLayout(PAtientCardLayout);
        PAtientCardLayout.setHorizontalGroup(
                PAtientCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PAtientCardLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(PAtientCardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(PatientLabel)
                                        .addComponent(PatientIcon))
                                .addContainerGap(122, Short.MAX_VALUE))
        );
        PAtientCardLayout.setVerticalGroup(
                PAtientCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PAtientCardLayout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(PatientIcon)
                                .addGap(45, 45, 45)
                                .addComponent(PatientLabel)
                                .addContainerGap(52, Short.MAX_VALUE))
        );

        ConsulationCard.setBackground(new Color(255, 255, 255));
        ConsulationCard.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));
        ConsulationCard.setPreferredSize(new Dimension(300, 300));

        ConsulatationLAbel.setFont(new Font("Bahnschrift", 1, 18));
        ConsulatationLAbel.setForeground(new Color(16, 33, 125));
        ConsulatationLAbel.setText("Consulation");

        ConsulationIcon.setIcon(new ImageIcon(getClass().getResource("../Images/medical-appointment (1).png")));

        GroupLayout ConsulationCardLayout = new GroupLayout(ConsulationCard);
        ConsulationCard.setLayout(ConsulationCardLayout);
        ConsulationCardLayout.setHorizontalGroup(
                ConsulationCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ConsulationCardLayout.createSequentialGroup()
                                .addContainerGap(112, Short.MAX_VALUE)
                                .addGroup(ConsulationCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, ConsulationCardLayout.createSequentialGroup()
                                                .addComponent(ConsulatationLAbel)
                                                .addGap(77, 77, 77))
                                        .addGroup(GroupLayout.Alignment.TRAILING, ConsulationCardLayout.createSequentialGroup()
                                                .addComponent(ConsulationIcon)
                                                .addGap(110, 110, 110))))
        );
        ConsulationCardLayout.setVerticalGroup(
                ConsulationCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, ConsulationCardLayout.createSequentialGroup()
                                .addContainerGap(115, Short.MAX_VALUE)
                                .addComponent(ConsulationIcon)
                                .addGap(43, 43, 43)
                                .addComponent(ConsulatationLAbel)
                                .addGap(52, 52, 52))
        );

        GroupLayout HomePanelLayout = new GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
                HomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(PAtientCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                                .addComponent(ConsulationCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
        );
        HomePanelLayout.setVerticalGroup(
                HomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HomePanelLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addGroup(HomePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(ConsulationCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PAtientCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(303, Short.MAX_VALUE))
        );

        CardLayoutDisplayer.add(HomePanel, "card5");

        PatientPanelMain.setBackground(new Color(255, 255, 255));
        PatientPanelMain.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));
        PatientPanelMain.setPreferredSize(new Dimension(1050, 656));

        GestionPatientLabel.setFont(new Font("Bahnschrift", 1, 18));
        GestionPatientLabel.setForeground(new Color(16, 33, 125));
        GestionPatientLabel.setText("Gestion des Patients");

        GestionPatientIcon.setIcon(new ImageIcon(getClass().getResource("../Images/health-insurance (1).png")));

        LeftSideMain.setBackground(new Color(255, 255, 255));

        ListePatient.setFont(new Font("Bahnschrift", 1, 18));
        ListePatient.setForeground(new Color(16, 33, 125));
        ListePatient.setText("Liste des Patients");

        TablePatient.setBorder(new MatteBorder(null));
        TablePatient.setModel(DbUtils.resultSetToTableModel(patientRepository.getAllByR()));
        TablePatient.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TablePatient.setGridColor(new Color(0, 161, 229));
        ListePatientScrolBar.setViewportView(TablePatient);

        ModifyPatientButton.setBackground(new Color(244, 249, 253));
        ModifyPatientButton.setFont(new Font("Segoe UI", 0, 18));
        ModifyPatientButton.setForeground(new Color(0, 161, 229));
        ModifyPatientButton.setIcon(new ImageIcon(getClass().getResource("../Images/edit.png")));
        ModifyPatientButton.setText("Modifier");
        ModifyPatientButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ModifyPatientButton.setMaximumSize(new Dimension(147, 35));
        ModifyPatientButton.setPreferredSize(new Dimension(120, 35));
        ModifyPatientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        });

        AddPatient.setBackground(new Color(244, 249, 253));
        AddPatient.setFont(new Font("Segoe UI", 0, 18));
        AddPatient.setForeground(new Color(0, 161, 229));
        AddPatient.setIcon(new ImageIcon(getClass().getResource("../Images/plus.png")));
        AddPatient.setText("Actualiser");
        AddPatient.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        AddPatient.setMaximumSize(new Dimension(147, 35));
        AddPatient.setPreferredSize(new Dimension(147, 35));
        AddPatient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TablePatient.setModel(DbUtils.resultSetToTableModel(patientRepository.getAllByR()));
            }
        });

        RemovePatientButton.setBackground(new Color(244, 249, 253));
        RemovePatientButton.setFont(new Font("Segoe UI", 0, 18));
        RemovePatientButton.setForeground(new Color(0, 161, 229));
        RemovePatientButton.setIcon(new ImageIcon(getClass().getResource("../Images/remove.png")));
        RemovePatientButton.setText("Supprimer");
        RemovePatientButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        RemovePatientButton.setMaximumSize(new Dimension(147, 35));
        RemovePatientButton.setPreferredSize(new Dimension(120, 35));
        RemovePatientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int row = TablePatient.getSelectedRow();
                String id_ = (TablePatient.getModel().getValueAt(row, 1)).toString();
                int id=Integer.parseInt(id_);
                patientRepository.delete(id);
            }
        });

        RightSideMMain.setBackground(new Color(255, 255, 255));
        RightSideMMain.setBorder(BorderFactory.createMatteBorder(0, 2, 0, 0, new Color(0, 161, 229)));

        IconConsulation.setIcon(new ImageIcon(getClass().getResource("../Images/consulting (2).png")));

        TypeConsulation.setModel(new DefaultComboBoxModel<>(new String[] { "Choisir le type", "Évaluation de santé préalable", "Évaluation de santé périodique", "Examen de reprise du travail", "Visite préalable à la reprise du travail", "Consultation spontanée", "Trajet de reintegration", "Protection de la maternité", " " }));
        TypeCons.setText("Type du Consultation");
        DateCons.setText("Date du Consutation");

        DateConsulation.setFormatterFactory(new DefaultFormatterFactory(new DateFormatter(new java.text.SimpleDateFormat("dd MM YYYY HH mm"))));
        DateConsulation.setText("25/03/2021 15:30");

        AjouterConsulationLabel.setFont(new Font("Tahoma", 1, 15));
        AjouterConsulationLabel.setForeground(new Color(16, 33, 125));
        AjouterConsulationLabel.setText("Ajouter une Consultation :");

        AddConsulationButton.setBackground(new Color(244, 249, 253));
        AddConsulationButton.setFont(new Font("Segoe UI", 0, 18));
        AddConsulationButton.setForeground(new Color(0, 161, 229));
        AddConsulationButton.setText("Ajouter");
        AddConsulationButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        AddConsulationButton.setMaximumSize(new Dimension(147, 35));
        AddConsulationButton.setPreferredSize(new Dimension(147, 35));
        AddConsulationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            }
        });

        GroupLayout RightSideMMainLayout = new GroupLayout(RightSideMMain);
        RightSideMMain.setLayout(RightSideMMainLayout);
        RightSideMMainLayout.setHorizontalGroup(
                RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(RightSideMMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(RightSideMMainLayout.createSequentialGroup()
                                                .addComponent(IconConsulation)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(AjouterConsulationLabel))
                                        .addGroup(RightSideMMainLayout.createSequentialGroup()
                                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(DateCons)
                                                        .addComponent(TypeCons))
                                                .addGap(40, 40, 40)
                                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(DateConsulation, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TypeConsulation, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, RightSideMMainLayout.createSequentialGroup()
                                                                .addComponent(AddConsulationButton, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)))))
                                .addGap(0, 31, Short.MAX_VALUE))
        );
        RightSideMMainLayout.setVerticalGroup(
                RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(RightSideMMainLayout.createSequentialGroup()
                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(IconConsulation)
                                        .addGroup(RightSideMMainLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(AjouterConsulationLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(DateCons)
                                        .addComponent(DateConsulation, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(RightSideMMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(TypeConsulation, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TypeCons))
                                .addGap(137, 137, 137)
                                .addComponent(AddConsulationButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE))
        );

        GroupLayout LeftSideMainLayout = new GroupLayout(LeftSideMain);
        LeftSideMain.setLayout(LeftSideMainLayout);
        LeftSideMainLayout.setHorizontalGroup(
                LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                .addGroup(LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                                .addGroup(LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                                                .addComponent(AddPatient, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(RemovePatientButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(ModifyPatientButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                                                .addGap(112, 112, 112)
                                                                .addComponent(ListePatient)))
                                                .addGap(36, 36, 36))
                                        .addGroup(GroupLayout.Alignment.TRAILING, LeftSideMainLayout.createSequentialGroup()
                                                .addComponent(ListePatientScrolBar, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addComponent(RightSideMMain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
        );
        LeftSideMainLayout.setVerticalGroup(
                LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, LeftSideMainLayout.createSequentialGroup()
                                .addGroup(LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RightSideMMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(LeftSideMainLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(LeftSideMainLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                                        .addComponent(ModifyPatientButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RemovePatientButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AddPatient, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addComponent(ListePatient, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ListePatientScrolBar, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        GroupLayout PatientPanelMainLayout = new GroupLayout(PatientPanelMain);
        PatientPanelMain.setLayout(PatientPanelMainLayout);
        PatientPanelMainLayout.setHorizontalGroup(
                PatientPanelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PatientPanelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PatientPanelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(LeftSideMain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PatientPanelMainLayout.createSequentialGroup()
                                                .addComponent(GestionPatientIcon)
                                                .addGap(18, 18, 18)
                                                .addComponent(GestionPatientLabel)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PatientPanelMainLayout.setVerticalGroup(
                PatientPanelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PatientPanelMainLayout.createSequentialGroup()
                                .addGroup(PatientPanelMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(PatientPanelMainLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(GestionPatientIcon))
                                        .addGroup(PatientPanelMainLayout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(GestionPatientLabel)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LeftSideMain, GroupLayout.PREFERRED_SIZE, 451, GroupLayout.PREFERRED_SIZE))
        );

        CardLayoutDisplayer.add(PatientPanelMain, "card2");

        PatientPanel.setBackground(new Color(255, 255, 255));
        PatientPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));

        AjoutPatientLAbel.setFont(new Font("Bahnschrift", 1, 18));
        AjoutPatientLAbel.setForeground(new Color(16, 33, 125));
        AjoutPatientLAbel.setText("Ajouter Patient");

        AjoutPatientIcon.setIcon(new ImageIcon(getClass().getResource("../Images/health-insurance (1).png")));

        persoInfo.setBackground(new Color(255, 255, 255));

        Icon2.setIcon(new ImageIcon(getClass().getResource("../Images/patient.png")));

        InfoPerso.setFont(new Font("Bahnschrift", 1, 14));
        InfoPerso.setForeground(new Color(16, 33, 125));
        InfoPerso.setText("Informations Personnelles");



        NomLabel.setText("Nom");

        PrenLabel.setText("Prénom");

        DtnLabel.setText("Date de naissance");

        Sexe.setText("Sexe:");

        buttonGroup1.add(jRadioButton4);


        buttonGroup1.add(jRadioButton5);

        jLabel42.setIcon(new ImageIcon(getClass().getResource("../Images/female.png")));

        jLabel43.setIcon(new ImageIcon(getClass().getResource("../Images/man.png")));

        VilleLAbel.setText("Ville");
        CodePostalLabel.setText("Code Postal");
        AdrLabel.setText("Adresse");
        emaillabel.setText("Email");
        ProfessionLabel.setText("Profession");


        GroupLayout persoInfoLayout = new GroupLayout(persoInfo);
        persoInfo.setLayout(persoInfoLayout);
        persoInfoLayout.setHorizontalGroup(
                persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(persoInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                .addComponent(Icon2)
                                                .addGap(18, 18, 18)
                                                .addComponent(InfoPerso)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(NomLabel)
                                                        .addComponent(PrenLabel)
                                                        .addComponent(DtnLabel)
                                                        .addComponent(AdrLabel)
                                                        .addComponent(ProfessionLabel))
                                                .addGap(28, 28, 28)
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(Dtn, GroupLayout.Alignment.LEADING)
                                                        .addComponent(pren, GroupLayout.Alignment.LEADING)
                                                        .addComponent(nom, GroupLayout.Alignment.LEADING)
                                                        .addComponent(adr)
                                                        .addComponent(profession, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, persoInfoLayout.createSequentialGroup()
                                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(VilleLAbel)
                                                                        .addComponent(Sexe))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jRadioButton4)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                                                .addComponent(jLabel42)
                                                                                .addGap(54, 54, 54)
                                                                                .addComponent(jRadioButton5)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel43)
                                                                                .addGap(74, 74, 74))
                                                                        .addComponent(ville)))
                                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                                .addComponent(emaillabel)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(email, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, persoInfoLayout.createSequentialGroup()
                                                                .addComponent(CodePostalLabel)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(codePosttal, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(121, 121, 121))))
        );
        persoInfoLayout.setVerticalGroup(
                persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(persoInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Icon2)
                                .addGap(8, 8, 8)
                                .addComponent(NomLabel)
                                .addGap(54, 54, 54)
                                .addComponent(PrenLabel)
                                .addGap(52, 52, 52)
                                .addComponent(DtnLabel)
                                .addGap(64, 64, 64)
                                .addComponent(AdrLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(ProfessionLabel)
                                .addGap(35, 35, 35))
                        .addGroup(persoInfoLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(InfoPerso)
                                .addGap(18, 18, 18)
                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                .addComponent(nom, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(pren, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(Dtn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(adr, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(Sexe)
                                                        .addGroup(persoInfoLayout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel42)
                                                                        .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel43)
                                                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jRadioButton5, GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jRadioButton4))))))
                                                .addGap(34, 34, 34)
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ville, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(VilleLAbel))
                                                .addGap(36, 36, 36)
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(codePosttal, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CodePostalLabel))
                                                .addGap(48, 48, 48)
                                                .addGroup(persoInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(email, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(emaillabel))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(profession, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
        );

        medicalinfo.setBackground(new Color(255, 255, 255));

        infoMedica.setFont(new Font("Bahnschrift", 1, 14));
        infoMedica.setForeground(new Color(16, 33, 125));
        infoMedica.setText("Informations Medicales");

        icon.setIcon(new ImageIcon(getClass().getResource("../Images/patient.png")));

        GroupSang.setText("Groupe Sanguin");



        Cnss.setText("CNSS");



        ButtonAnnullerrPatient.setBackground(new Color(244, 249, 253));
        ButtonAnnullerrPatient.setFont(new Font("Segoe UI", 1, 13));
        ButtonAnnullerrPatient.setForeground(new Color(0, 161, 229));
        ButtonAnnullerrPatient.setText("Annuler");
        ButtonAnnullerrPatient.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ButtonAnnullerrPatient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ButtonAnnullerrPatientActionPerformed(evt);
            }
        });

        ButtonAjouterPatient.setBackground(new Color(244, 249, 253));
        ButtonAjouterPatient.setFont(new Font("Segoe UI", 1, 13));
        ButtonAjouterPatient.setForeground(new Color(0, 161, 229));
        ButtonAjouterPatient.setText("Ajouter");
        ButtonAjouterPatient.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ButtonAjouterPatient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ButtonAjouterPatientActionPerformed(evt);
            }
        });

        GroupLayout medicalinfoLayout = new GroupLayout(medicalinfo);
        medicalinfo.setLayout(medicalinfoLayout);
        medicalinfoLayout.setHorizontalGroup(
                medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(icon)
                                                .addGap(18, 18, 18)
                                                .addComponent(infoMedica))
                                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                                                .addComponent(ButtonAjouterPatient, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(ButtonAnnullerrPatient, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Cnss)
                                                                        .addComponent(GroupSang))
                                                                .addGap(52, 52, 52)
                                                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(GroupSangLAbel, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                                        .addComponent(CnssPAtient))))))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        medicalinfoLayout.setVerticalGroup(
                medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(icon)
                                        .addGroup(medicalinfoLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(infoMedica)))
                                .addGap(65, 65, 65)
                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(GroupSang)
                                        .addComponent(GroupSangLAbel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Cnss)
                                        .addComponent(CnssPAtient, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                                .addGroup(medicalinfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ButtonAnnullerrPatient, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonAjouterPatient, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        GroupLayout PatientPanelLayout = new GroupLayout(PatientPanel);
        PatientPanel.setLayout(PatientPanelLayout);
        PatientPanelLayout.setHorizontalGroup(
                PatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PatientPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(PatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(PatientPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(AjoutPatientIcon)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(AjoutPatientLAbel))
                                        .addGroup(PatientPanelLayout.createSequentialGroup()
                                                .addComponent(persoInfo, GroupLayout.PREFERRED_SIZE, 638, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(medicalinfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PatientPanelLayout.setVerticalGroup(
                PatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PatientPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(AjoutPatientIcon)
                                        .addGroup(PatientPanelLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(AjoutPatientLAbel)))
                                .addGap(18, 18, 18)
                                .addGroup(PatientPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(persoInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(medicalinfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CardLayoutDisplayer.add(PatientPanel, "card2");

        ConsultationPanel.setBackground(new Color(255, 255, 255));
        ConsultationPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 161, 229)));

        ConsulationsIcon.setIcon(new ImageIcon(getClass().getResource("../Images/medical-appointment (2).png")));

        ConsulationLabel.setFont(new Font("Bahnschrift", 1, 18));
        ConsulationLabel.setForeground(new Color(16, 33, 125));
        ConsulationLabel.setText("Gestion des Consultations");

        LeftSideMain1.setBackground(new Color(255, 255, 255));

        ListeConsulation.setFont(new Font("Bahnschrift", 1, 18));
        ListeConsulation.setForeground(new Color(16, 33, 125));
        ListeConsulation.setText("Liste des Consultations");

        TableConsulation.setBorder(new MatteBorder(null));
        TableConsulation.setModel(DbUtils.resultSetToTableModel(consultationRepository.getAllByR()));
        TableConsulation.setGridColor(new Color(0, 161, 229));
        ListePatientScrolBar1.setViewportView(TableConsulation);

        ModifyConsulationtButton.setBackground(new Color(244, 249, 253));
        ModifyConsulationtButton.setFont(new Font("Segoe UI", 0, 18));
        ModifyConsulationtButton.setForeground(new Color(0, 161, 229));
        ModifyConsulationtButton.setIcon(new ImageIcon(getClass().getResource("../Images/edit.png")));
        ModifyConsulationtButton.setText("Modifier");
        ModifyConsulationtButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ModifyConsulationtButton.setMaximumSize(new Dimension(147, 35));
        ModifyConsulationtButton.setPreferredSize(new Dimension(147, 35));
        ModifyConsulationtButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ModifyConsulationtButtonActionPerformed(evt);
            }
        });

        AddConsulation.setBackground(new Color(244, 249, 253));
        AddConsulation.setFont(new Font("Segoe UI", 0, 18));
        AddConsulation.setForeground(new Color(0, 161, 229));
        AddConsulation.setIcon(new ImageIcon(getClass().getResource("../Images/plus.png")));
        AddConsulation.setText("Actualiser");
        AddConsulation.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        AddConsulation.setMaximumSize(new Dimension(147, 35));
        AddConsulation.setPreferredSize(new Dimension(147, 35));
        AddConsulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TableConsulation.setModel(DbUtils.resultSetToTableModel(consultationRepository.getAllByR()));

            }
        });

        RemoveConsulationButton.setBackground(new Color(244, 249, 253));
        RemoveConsulationButton.setFont(new Font("Segoe UI", 0, 18));
        RemoveConsulationButton.setForeground(new Color(0, 161, 229));
        RemoveConsulationButton.setIcon(new ImageIcon(getClass().getResource("../Images/remove.png")));
        RemoveConsulationButton.setText("Supprimer");
        RemoveConsulationButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        RemoveConsulationButton.setMaximumSize(new Dimension(147, 35));
        RemoveConsulationButton.setPreferredSize(new Dimension(147, 35));
        RemoveConsulationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int row = TableConsulation.getSelectedRow();
                String id_ = (TableConsulation.getModel().getValueAt(row, 1)).toString();
                int id=Integer.parseInt(id_);
                consultationRepository.delete(id);
            }
        });

        OrdonnanceCard.setBackground(new Color(255, 255, 255));
        OrdonnanceCard.setBorder(BorderFactory.createMatteBorder(0, 2, 2, 2, new Color(0, 161, 229)));
        OrdonnanceCard.setPreferredSize(new Dimension(300, 300));

        AjoutOrdonnaceLabel.setFont(new Font("Tahoma", 1, 15));
        AjoutOrdonnaceLabel.setForeground(new Color(16, 33, 125));
        AjoutOrdonnaceLabel.setText("Ajouter une Ordonnance :");

        NombreLabel.setText("Nombre de fois:");

        medicamentLabel.setText("Médicament");

        DosageLabel.setText("Dosage");
        uneParjour.setText("1/jour");

        deuxPArJour.setText("2/jour");
        TroisParJour.setText("3/jour");
        ModeList.setModel(new DefaultComboBoxModel<>(new String[] { "Choisir", "orale", "injection", "dermique", " " }));
        ModeLabel.setText("Mode ");
        Prescreption.setIcon(new ImageIcon(getClass().getResource("../Images/prescription.png")));

        loginButton.setBackground(new Color(244, 249, 253));
        loginButton.setFont(new Font("Segoe UI", 1, 13));
        loginButton.setForeground(new Color(0, 161, 229));
        loginButton.setText("Ajouter");
        loginButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        GroupLayout OrdonnanceCardLayout = new GroupLayout(OrdonnanceCard);
        OrdonnanceCard.setLayout(OrdonnanceCardLayout);
        OrdonnanceCardLayout.setHorizontalGroup(
                OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                                .addComponent(Prescreption)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AjoutOrdonnaceLabel))
                                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(DosageLabel)
                                                        .addComponent(NombreLabel)
                                                        .addComponent(ModeLabel)
                                                        .addComponent(medicamentLabel))
                                                .addGap(55, 55, 55)
                                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(dosage, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                                                .addComponent(uneParjour)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(deuxPArJour)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(TroisParJour))
                                                        .addComponent(medicament, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(ModeList, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(62, Short.MAX_VALUE))
        );
        OrdonnanceCardLayout.setVerticalGroup(
                OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(Prescreption)
                                        .addGroup(OrdonnanceCardLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(AjoutOrdonnaceLabel)))
                                .addGap(79, 79, 79)
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(medicamentLabel)
                                        .addComponent(medicament, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(NombreLabel)
                                        .addComponent(uneParjour)
                                        .addComponent(deuxPArJour)
                                        .addComponent(TroisParJour))
                                .addGap(30, 30, 30)
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(DosageLabel)
                                        .addComponent(dosage, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(OrdonnanceCardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ModeList, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ModeLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout LeftSideMain1Layout = new GroupLayout(LeftSideMain1);
        LeftSideMain1.setLayout(LeftSideMain1Layout);
        LeftSideMain1Layout.setHorizontalGroup(
                LeftSideMain1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LeftSideMain1Layout.createSequentialGroup()
                                .addGroup(LeftSideMain1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(LeftSideMain1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(AddConsulation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RemoveConsulationButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(ModifyConsulationtButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(LeftSideMain1Layout.createSequentialGroup()
                                                .addGap(127, 127, 127)
                                                .addComponent(ListeConsulation))
                                        .addComponent(ListePatientScrolBar1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OrdonnanceCard, GroupLayout.PREFERRED_SIZE, 491, GroupLayout.PREFERRED_SIZE))
        );
        LeftSideMain1Layout.setVerticalGroup(
                LeftSideMain1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LeftSideMain1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(LeftSideMain1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(ModifyConsulationtButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RemoveConsulationButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddConsulation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ListeConsulation, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListePatientScrolBar1, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(LeftSideMain1Layout.createSequentialGroup()
                                .addComponent(OrdonnanceCard, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
        );

        GroupLayout ConsultationPanelLayout = new GroupLayout(ConsultationPanel);
        ConsultationPanel.setLayout(ConsultationPanelLayout);
        ConsultationPanelLayout.setHorizontalGroup(
                ConsultationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ConsultationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ConsulationsIcon)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConsulationLabel)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, ConsultationPanelLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LeftSideMain1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        ConsultationPanelLayout.setVerticalGroup(
                ConsultationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, ConsultationPanelLayout.createSequentialGroup()
                                .addGroup(ConsultationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(ConsultationPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(ConsulationsIcon))
                                        .addGroup(ConsultationPanelLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(ConsulationLabel)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LeftSideMain1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        CardLayoutDisplayer.add(ConsultationPanel, "card4");

        SideBar.setLayout(new GridLayout(30, 1));
        SideBar.add(jLabel1);
        SideBar.add(jLabel2);
        SideBar.add(jLabel3);
        SideBar.add(jLabel4);

        BackDashboard.setBackground(new Color(244, 249, 253));
        BackDashboard.setFont(new Font("Segoe UI", 0, 18));
        BackDashboard.setForeground(new Color(0, 161, 229));
        BackDashboard.setIcon(new ImageIcon(getClass().getResource("../Images/homepage.png")));
        BackDashboard.setText("Acceuil");
        BackDashboard.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        BackDashboard.setMaximumSize(new Dimension(85, 35));
        BackDashboard.setMinimumSize(new Dimension(85, 35));
        BackDashboard.setPreferredSize(new Dimension(85, 35));
        BackDashboard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackDashboardActionPerformed(evt);
            }
        });
        SideBar.add(BackDashboard);
        SideBar.add(jLabel6);

        PatientMainButton.setBackground(new Color(244, 249, 253));
        PatientMainButton.setFont(new Font("Segoe UI", 0, 18));
        PatientMainButton.setForeground(new Color(0, 161, 229));
        PatientMainButton.setIcon(new ImageIcon(getClass().getResource("../Images/health-insurance (2).png")));
        PatientMainButton.setText("Patients");
        PatientMainButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        PatientMainButton.setMaximumSize(new Dimension(147, 35));
        PatientMainButton.setPreferredSize(new Dimension(147, 35));
        PatientMainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientMainButtonActionPerformed(evt);
            }
        });
        SideBar.add(PatientMainButton);
        SideBar.add(jLabel5);

        AddPatientButton.setBackground(new Color(244, 249, 253));
        AddPatientButton.setFont(new Font("Segoe UI", 0, 18));
        AddPatientButton.setForeground(new Color(0, 161, 229));
        AddPatientButton.setIcon(new ImageIcon(getClass().getResource("../Images/health-insurance (2).png")));
        AddPatientButton.setText("Ajouter Patient");
        AddPatientButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        AddPatientButton.setMaximumSize(new Dimension(147, 35));
        AddPatientButton.setPreferredSize(new Dimension(147, 35));
        AddPatientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddPatientButtonActionPerformed(evt);
            }
        });
        SideBar.add(AddPatientButton);
        SideBar.add(jLabel12);

        ConsulationButton.setBackground(new Color(244, 249, 253));
        ConsulationButton.setFont(new Font("Segoe UI", 0, 18));
        ConsulationButton.setForeground(new Color(0, 161, 229));
        ConsulationButton.setIcon(new ImageIcon(getClass().getResource("../Images/medical-appointment (1).png")));
        ConsulationButton.setText("Consultations");
        ConsulationButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        ConsulationButton.setPreferredSize(new Dimension(135, 35));
        ConsulationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ConsulationButtonActionPerformed(evt);
            }
        });
        SideBar.add(ConsulationButton);
        SideBar.add(jLabel8);
        SideBar.add(jLabel9);
        SideBar.add(jLabel15);
        SideBar.add(jLabel16);
        SideBar.add(jLabel17);
        SideBar.add(jLabel18);
        SideBar.add(jLabel19);
        SideBar.add(jLabel22);
        SideBar.add(jLabel24);
        SideBar.add(jLabel25);

        LogoutButton.setBackground(new Color(244, 249, 253));
        LogoutButton.setFont(new Font("Segoe UI", 0, 18));
        LogoutButton.setForeground(new Color(0, 161, 229));
        LogoutButton.setIcon(new ImageIcon(getClass().getResource("../Images/logout (1).png")));
        LogoutButton.setText("Déconnecter");
        LogoutButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 161, 229)));
        LogoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                new Authentification().setVisible(true);
            }
        });
        SideBar.add(LogoutButton);
        SideBar.add(jLabel26);
        SideBar.add(jLabel27);
        SideBar.add(jLabel28);
        SideBar.add(jLabel29);
        SideBar.add(jLabel30);
        SideBar.add(jLabel31);
        SideBar.add(jLabel32);
        SideBar.add(jLabel33);

        GroupLayout DashboardPanelLayout = new GroupLayout(DashboardPanel);
        DashboardPanel.setLayout(DashboardPanelLayout);
        DashboardPanelLayout.setHorizontalGroup(
                DashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(DashboardPanelLayout.createSequentialGroup()
                                .addComponent(SideBar, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                .addGroup(DashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(DashboardPanelLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CardLayoutDisplayer, GroupLayout.PREFERRED_SIZE, 1011, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, DashboardPanelLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Bonjour, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
                                                .addGap(283, 283, 283))))
        );
        DashboardPanelLayout.setVerticalGroup(
                DashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(DashboardPanelLayout.createSequentialGroup()
                                .addGroup(DashboardPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(DashboardPanelLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(Bonjour, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(CardLayoutDisplayer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(SideBar, GroupLayout.PREFERRED_SIZE, 831, Short.MAX_VALUE))
                                .addContainerGap())
        );

        getContentPane().add(DashboardPanel, BorderLayout.CENTER);

        header.setBackground(new Color(0, 161, 229));

        close.setFont(new Font("SansSerif", 1, 24));
        close.setForeground(new Color(240, 240, 240));
        close.setIcon(new ImageIcon(getClass().getResource("../Images/close-cross.png")));
        close.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                System.exit(0);
            }
        });

        logo.setIcon(new ImageIcon(getClass().getResource("../Images/logo (7).png")));

        GroupLayout LogoPanelLayout = new GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
                LogoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, LogoPanelLayout.createSequentialGroup()
                                .addComponent(logo, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        LogoPanelLayout.setVerticalGroup(
                LogoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(LogoPanelLayout.createSequentialGroup()
                                .addComponent(logo)
                                .addGap(0, 1, Short.MAX_VALUE))
        );

        GroupLayout headerLayout = new GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addComponent(LogoPanel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 983, Short.MAX_VALUE)
                                .addComponent(close)
                                .addGap(27, 27, 27))
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(LogoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(close)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(header, BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);

    }

    private void BackDashboardActionPerformed(ActionEvent evt) {
        CardLayoutDisplayer.removeAll();
        CardLayoutDisplayer.add(HomePanel);
        CardLayoutDisplayer.repaint();
        CardLayoutDisplayer.revalidate();
    }

    private void AddPatientButtonActionPerformed(ActionEvent evt) {
        CardLayoutDisplayer.removeAll();
        CardLayoutDisplayer.add(PatientPanel);
        CardLayoutDisplayer.repaint();
        CardLayoutDisplayer.revalidate();
    }

    private void ConsulationButtonActionPerformed(ActionEvent evt) {
        CardLayoutDisplayer.removeAll();
        CardLayoutDisplayer.add(ConsultationPanel);
        CardLayoutDisplayer.repaint();
        CardLayoutDisplayer.revalidate();
    }


    private void loginButtonActionPerformed(ActionEvent evt) {

    }

    private void ButtonAjouterPatientActionPerformed(ActionEvent evt) {

    }

    private void ButtonAnnullerrPatientActionPerformed(ActionEvent evt) {

    }


    private void PatientMainButtonActionPerformed(ActionEvent evt) {
        CardLayoutDisplayer.removeAll();
        CardLayoutDisplayer.add(PatientPanelMain);
        CardLayoutDisplayer.repaint();
        CardLayoutDisplayer.revalidate();
    }


    private void ModifyConsulationtButtonActionPerformed(ActionEvent evt) {
    }





}

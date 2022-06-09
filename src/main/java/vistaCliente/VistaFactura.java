package vistaCliente;
//@michi y gaby
import controladorCliente.FacturaControl;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modeloCliente.Factura;

public class VistaFactura extends JFrame implements ActionListener {
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JTextField> jtextFieldList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private List<JRadioButton>jRadioButton;
    private FacturaControl facturaControl;
    public VistaFactura(String title){
        super(title);
        this.setSize(500, 600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        facturaControl = new FacturaControl(); 
    }
    
    public void IniciarComponentes(){
       this.jPanelList = new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
    }
       public void iniciarComponentes(){
       this.jPanelList = new ArrayList<>();
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
       this.jPanelList.add(new JPanel());
      
      
       this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder("Facturas"));
       this.jPanelList.get(0).setLayout(new GridLayout(7,1));
       this.jPanelList.get(0).add(this.jPanelList.get(1));
       this.jPanelList.get(0).add(this.jPanelList.get(2));
       this.jPanelList.get(0).add(this.jPanelList.get(3));
       this.jPanelList.get(0).add(this.jPanelList.get(4));
       this.jPanelList.get(0).add(this.jPanelList.get(5));
       this.jPanelList.get(0).add(this.jPanelList.get(6));
       this.jPanelList.get(0).add(this.jPanelList.get(7));
       
       this.iniciarEtiquetas();
       this.jPanelList.get(1).add(this.jLabelList.get(0));
       this.jPanelList.get(2).add(this.jLabelList.get(1));
       this.jPanelList.get(3).add(this.jLabelList.get(2));
       this.jPanelList.get(4).add(this.jLabelList.get(3));
       this.jPanelList.get(5).add(this.jLabelList.get(5));
       this.jPanelList.get(6).add(this.jLabelList.get(4));
       
       
       this.iniciarCuadrosTexto();
       this.jPanelList.get(1).add(this.jtextFieldList.get(0));
       this.jPanelList.get(2).add(this.jtextFieldList.get(1));
       this.jPanelList.get(3).add(this.jtextFieldList.get(2));
       this.jPanelList.get(4).add(this.jtextFieldList.get(3));
       this.jPanelList.get(4).add(this.jtextFieldList.get(4));
       this.jPanelList.get(4).add(this.jtextFieldList.get(5));
       
       

              
       this.iniciarBotones();
       this.jPanelList.get(7).add(this.jButtonList.get(0));
       this.jPanelList.get(7).add(this.jButtonList.get(1));

       this.iniciarCombo1();
       this.jPanelList.get(6).add(this.jComboBox1);
       this.jPanelList.get(6).add(this.jComboBox1);
       
       this.iniciarRadio();
       this.jPanelList.get(5).add(this.jRadioButton.get(0));
       this.jPanelList.get(5).add(this.jRadioButton.get(1));

   }
     public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setText("Ingrese el código de producto: "); 
       this.jLabelList.get(1).setText("Ingrese el nombre del producto: ");
       this.jLabelList.get(2).setText("Ingrese numero de contacto: ");
       this.jLabelList.get(3).setText("Ingrese la fecha de Registro: AAAA/MM/DD");
       
   }

   public void iniciarCuadrosTexto(){
       this.jtextFieldList = new ArrayList<>();
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       this.jtextFieldList.add(new JTextField());
       
       
       this.jtextFieldList.get(0).setColumns(5);
       this.jtextFieldList.get(1).setColumns(20);
       this.jtextFieldList.get(2).setColumns(20);
       this.jtextFieldList.get(3).setColumns(4);
       this.jtextFieldList.get(4).setColumns(2);
       this.jtextFieldList.get(5).setColumns(2);
   }

   public void iniciarBotones(){
       this.jButtonList = new ArrayList<>();
       this.jButtonList.add(new JButton());
       this.jButtonList.add(new JButton());
       
       this.jButtonList.get(0).setText("Registrar");
       this.jButtonList.get(0).addActionListener(this);
       
       this.jButtonList.get(1).setText("Mostrar");
       this.jButtonList.get(1).addActionListener(this);
       
   }
   public void iniciarRadio(){
       this.jRadioButton = new ArrayList<>();
       this.jRadioButton.add(new JRadioButton("Factura con datos"));
       this.jRadioButton.add(new JRadioButton("Consumidor Final"));
       
       this.jRadioButton.get(0).addActionListener(this);
       this.jRadioButton.get(1).addActionListener(this);
   
       this.jPanelList.get(3).add(this.jRadioButton.get(0));
   }
         public void iniciarCombo1(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Desea imprimir");
        this.jComboBox1.addItem("SI");
        this.jComboBox1.addItem("NO");
        
        
        this.jPanelList.get(4).add(this.jComboBox1);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource().equals(this.jButtonList.get(0))){
            String [] params = new String[6];
            params[0]=this.jtextFieldList.get(0).getText();
            params[1]=this.jtextFieldList.get(1).getText();
            params[2]=this.jtextFieldList.get(2).getText();
            params[3]=this.jtextFieldList.get(3).getText();
            params[4]=this.jtextFieldList.get(4).getText();
            params[5]=this.jtextFieldList.get(5).getText();
            params[5]=this.jtextFieldList.get(5).getText();

            this.facturaControl.crear(params);
        }
        
        if(e.getSource().equals(this.jButtonList.get(1))){
            for(Factura f: this.facturaControl.listar())
                System.out.println(f.toString());  
        }
    }
}
    

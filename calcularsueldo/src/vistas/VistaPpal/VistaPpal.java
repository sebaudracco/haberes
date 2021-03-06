
package vistas.VistaPpal;

import javax.swing.JTextField;
import presentadores.PresVistaPrincipal;
/**
 *
 * @author sebaudracco
 */

    public class VistaPpal extends javax.swing.JFrame {
    private PresVistaPrincipal presVistaPrincipal;

    public VistaPpal() {
        initComponents();

        this.presVistaPrincipal = new PresVistaPrincipal(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        aplicacionTabbedPane = new javax.swing.JTabbedPane();
        datosPersonalesPanel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        apellidoLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        sueldoBaseLabel = new javax.swing.JLabel();
        sueldoBaseTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        dniTextField = new javax.swing.JTextField();
        botonGuardarDatosPersonalesApretado = new javax.swing.JButton();
        calculadoraSueldoPanel = new javax.swing.JPanel();
        precioDelArticuloLabel = new javax.swing.JLabel();
        cantidadArticulosVendidosLabel = new javax.swing.JLabel();
        cantidadArticulosVendidosTextField = new javax.swing.JTextField();
        precioArticuloTextField = new javax.swing.JTextField();
        guardarArticuloButton = new javax.swing.JButton();
        calcularSueldoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setText("Nombre:");

        apellidoLabel.setText("Apellido:");

        dniLabel.setText("DNI:");

        sueldoBaseLabel.setText("Sueldo Base:");

        botonGuardarDatosPersonalesApretado.setText("Guardar datos personales");
        botonGuardarDatosPersonalesApretado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarDatosPersonalesApretado(evt);
            }
        });

        javax.swing.GroupLayout datosPersonalesPanelLayout = new javax.swing.GroupLayout(datosPersonalesPanel);
        datosPersonalesPanel.setLayout(datosPersonalesPanelLayout);
        datosPersonalesPanelLayout.setHorizontalGroup(
            datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPersonalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(datosPersonalesPanelLayout.createSequentialGroup()
                        .addGap(0, 349, Short.MAX_VALUE)
                        .addComponent(botonGuardarDatosPersonalesApretado))
                    .addGroup(datosPersonalesPanelLayout.createSequentialGroup()
                        .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLabel)
                            .addComponent(apellidoLabel)
                            .addComponent(dniLabel)
                            .addComponent(sueldoBaseLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sueldoBaseTextField)
                            .addComponent(nombreTextField)
                            .addComponent(apellidoTextField)
                            .addComponent(dniTextField))))
                .addContainerGap())
        );
        datosPersonalesPanelLayout.setVerticalGroup(
            datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPersonalesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoLabel)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosPersonalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoBaseLabel)
                    .addComponent(sueldoBaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(botonGuardarDatosPersonalesApretado)
                .addContainerGap())
        );

        aplicacionTabbedPane.addTab("Datos personales", datosPersonalesPanel);

        precioDelArticuloLabel.setText("Precio del artículo:");

        cantidadArticulosVendidosLabel.setText("Cantidad de artículos vendidos:");

        guardarArticuloButton.setText("Guardar artículo");
        guardarArticuloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarArticuloApretado(evt);
            }
        });

        calcularSueldoButton.setText("Calcular sueldo");
        calcularSueldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularSueldoApretado(evt);
            }
        });

        javax.swing.GroupLayout calculadoraSueldoPanelLayout = new javax.swing.GroupLayout(calculadoraSueldoPanel);
        calculadoraSueldoPanel.setLayout(calculadoraSueldoPanelLayout);
        calculadoraSueldoPanelLayout.setHorizontalGroup(
            calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraSueldoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calculadoraSueldoPanelLayout.createSequentialGroup()
                        .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadArticulosVendidosLabel)
                            .addComponent(precioDelArticuloLabel))
                        .addGap(18, 18, 18)
                        .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadArticulosVendidosTextField)
                            .addComponent(precioArticuloTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculadoraSueldoPanelLayout.createSequentialGroup()
                        .addComponent(calcularSueldoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarArticuloButton)))
                .addContainerGap())
        );
        calculadoraSueldoPanelLayout.setVerticalGroup(
            calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculadoraSueldoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioDelArticuloLabel)
                    .addComponent(precioArticuloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadArticulosVendidosLabel)
                    .addComponent(cantidadArticulosVendidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(calculadoraSueldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarArticuloButton)
                    .addComponent(calcularSueldoButton))
                .addContainerGap())
        );

        aplicacionTabbedPane.addTab("Calculadora sueldo", calculadoraSueldoPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aplicacionTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aplicacionTabbedPane)
        );

        pack();
    }// </editor-fold>                        

    public javax.swing.JTextField getApellidoTextField() {
        return this.apellidoTextField;
    }

    public javax.swing.JTextField getDniTextField() {
        return this.dniTextField;
    }

    public javax.swing.JTextField getNombreTextField() {
        return this.nombreTextField;
    }

    public javax.swing.JTextField getSueldoBaseTextField() {
        return this.sueldoBaseTextField;
    }

    public JTextField getCantidadArticulosVendidosTextField() {
        return cantidadArticulosVendidosTextField;
    }

    public JTextField getPrecioArticuloTextField() {
        return precioArticuloTextField;
    }
    
    
    private void botonGuardarDatosPersonalesApretado(java.awt.event.ActionEvent evt) {                                                     
        this.presVistaPrincipal.guardarDatosPersonales();
    }                                                    

    private void botonGuardarArticuloApretado(java.awt.event.ActionEvent evt) {                                              
        this.presVistaPrincipal.guardarArticulo();
    }                                             

    private void botonCalcularSueldoApretado(java.awt.event.ActionEvent evt) {                                             
        this.presVistaPrincipal.calcularSueldo();
    }                                            
    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel apellidoLabel;
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JTabbedPane aplicacionTabbedPane;
    private javax.swing.JButton botonGuardarDatosPersonalesApretado;
    private javax.swing.JPanel calculadoraSueldoPanel;
    private javax.swing.JButton calcularSueldoButton;
    private javax.swing.JLabel cantidadArticulosVendidosLabel;
    private javax.swing.JTextField cantidadArticulosVendidosTextField;
    private javax.swing.JPanel datosPersonalesPanel;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JButton guardarArticuloButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField precioArticuloTextField;
    private javax.swing.JLabel precioDelArticuloLabel;
    private javax.swing.JLabel sueldoBaseLabel;
    private javax.swing.JTextField sueldoBaseTextField;
    // End of variables declaration                   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author 20151134010213
 */
public class Table {
    
    public void ModificarTable(JTable Table){
        Table.getColumnModel().getColumn(0).setPreferredWidth(100);
        Table.getColumnModel().getColumn(1).setPreferredWidth(100);
        Table.getColumnModel().getColumn(2).setPreferredWidth(500);
        Table.getColumnModel().getColumn(3).setPreferredWidth(200);
        //----------------------------------------------------------------------
        JTableHeader header =  Table.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        Table.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        //----------------------------------------------------------------------
        DefaultTableCellRenderer Centro_cedula = new DefaultTableCellRenderer();
        Centro_cedula.setHorizontalAlignment(SwingConstants.CENTER);
        
        Table.getColumnModel().getColumn(0).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(1).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(2).setCellRenderer(Centro_cedula);
        Table.getColumnModel().getColumn(3).setCellRenderer(Centro_cedula);
        
        
    }
    
}

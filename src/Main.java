import javax.swing.JOptionPane;
void main() {
    JOptionPane.showMessageDialog(null, "--- Registrando al Empleado 1 ---");
    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
    String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:");
    String ssalario = JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:");
    double salario = Double.parseDouble(ssalario);

     if(salario<0){
         do {
             ssalario = JOptionPane.showInputDialog(null, "ERROR, INGRESE UN VALOR CORRECTO");
             salario = Double.parseDouble(ssalario);
         }while (salario<0);
     }

    double salarioa1 = salario*12;

    Empleado e1 = new Empleado(nombre, apellido, salario);

    System.out.println(e1.getNombre());
    System.out.println(e1.getApellido());
    System.out.println(e1.getSalario());
    System.out.println(salarioa1);

    JOptionPane.showMessageDialog(null, "--- Registrando al Empleado 2 ---");
     nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado:");
     apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del empleado:");
     ssalario = JOptionPane.showInputDialog(null, "Ingrese el salario del empleado:");
     salario = Double.parseDouble(ssalario);

    if(salario<0){
        do {
            ssalario = JOptionPane.showInputDialog(null, "ERROR, INGRESE UN VALOR CORRECTO");
            salario = Double.parseDouble(ssalario);
        }while (salario<0);
    }

    double salarioa2 = salario*12;
    Empleado e2 = new Empleado(nombre, apellido, salario);

    System.out.println(e2.getNombre());
    System.out.println(e2.getApellido());
    System.out.println(e2.getSalario());
    System.out.println(salarioa2);


    System.out.println("Se realiza un aumento del 10% a todos los empleados!");
    System.out.println(salarioa1*1.1);
    System.out.println(salarioa2*1.1);

}

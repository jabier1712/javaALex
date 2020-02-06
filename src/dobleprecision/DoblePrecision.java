
package dobleprecision;

/**
 *
 * @author Quijano
 */
//tipo float con precisión normalÆ habitualmente 32 bits repartidos entre mantisa y exponente
//tipo double con doble precisión Æ habitualmente 64 bits repartidos entre mantisa y exponente 
public class DoblePrecision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Normal = 23.435;//variable de tipo decimal y normal
        double c =234.43e32;//variable double de doble presicion(notacion cientifica)
        float r; double p; /* Declaración de variables de tipo real (simple y doble
 precisión) */
       // .....................
       //Se utilizan para hacer  notación científica 
        r=23.435f;
        r=234.43e32f; /* Esto es, en r se almacena la constante 234,43 x 10^32 */
        p=-3.43e-15; /* Esto es, en r se almacena la constante -3,43 x 10^(-15) */
        
        System.out.println("El valor de la variable cientifica de doble precicion es :"+(p*r));
        //se oueden hacer las mismas operacionses que un tipo de dato double, integer 
        //se utilizan cuando la cantidad de numeros es muy grande gerelamnete cuand supera los 32 bits
        System.out.println("El numero mas alto es "+Math.max(r, p));//asi se puede usar todas la librerias math
    }
    
}

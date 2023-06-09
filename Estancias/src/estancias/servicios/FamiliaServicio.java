package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;
import java.util.Collection;

/**
 *
 * @author TWL
 */
public class FamiliaServicio {
    
    private FamiliaDAO dao;

    public FamiliaServicio() {
        this.dao = new FamiliaDAO();
    }
    
    
        public void imprimirCond1() throws Exception {
        try {
            //Listamos los productos según la condición impuesta
            Collection<Familia> familias = dao.listarFamiliasCond1();
            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir.");
            } else {
                System.out.println("id_familia  nombre      edad_minima     edad_maxima     num_hijos               email");
                for (Familia f : familias) {
                    System.out.println(f.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
        
        public void imprimirCond3() throws Exception {
        try {
            //Listamos los productos según la condición impuesta
            Collection<Familia> familias = dao.listarFamiliasCond3();
            //Imprimimos los productos
            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir.");
            } else {
                System.out.println("id_familia  nombre      edad_minima     edad_maxima     num_hijos               email");
                for (Familia f : familias) {
                    System.out.println(f.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
/*
a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.
c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
*/
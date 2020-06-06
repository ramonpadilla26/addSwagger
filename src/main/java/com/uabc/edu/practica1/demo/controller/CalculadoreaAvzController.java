package com.uabc.edu.practica1.demo.controller;
import com.uabc.edu.practica1.demo.model.Operacion;
import org.springframework.web.bind.annotation.*;

import static com.uabc.edu.practica1.demo.model.OPERACIONES.*;

@RestController
@RequestMapping("/api")
public class CalculadoreaAvzController {
    @PostMapping("ops")
    public Operacion Operacion(@RequestBody Operacion operacion){
        switch (operacion.getOp())
        {
            case SUMA:
                operacion.setResultado(operacion.getNumeroA()+operacion.getNumeroB());
                break;
            case RESTA:
                operacion.setResultado(operacion.getNumeroA()-operacion.getNumeroB());

                break;
            case DIVISION:
                if(operacion.getNumeroA()!=0&&
                        operacion.getNumeroB()!=0) {
                    operacion.setResultado(operacion.getNumeroA() /
                            operacion.getNumeroB());
                }else
                {
                    operacion.setResultado(-1);
                }
                break;
            case MULTIPLICACION:
                operacion.setResultado(operacion.getNumeroA()*operacion.getNumeroB());

                break;


        }
        return operacion;

    }
}

package com.Tech4good.Tech4good.CONTROLADORES;

import com.Tech4good.Tech4good.MODELOS.Donantes;
import com.Tech4good.Tech4good.REPOSITORIOS.DonantesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DonantesController {

    DonantesRepository repositorio;

    public DonantesController(DonantesRepository repositorio) {
        this.repositorio = repositorio;
    }


    @GetMapping("/api/Registrados")
    public List<Donantes> usuariosRegistrados(){
        return repositorio.findAll();
    }

    @GetMapping("/api/Registrado/{id}")
    public ResponseEntity<Donantes> registroUsuario(@PathVariable Long id){
        Optional<Donantes> opt = repositorio.findById(id);

        if (opt.isEmpty()){
            return ResponseEntity.badRequest().build();
        }else {
            return ResponseEntity.ok(opt.get());
        }

    }
    
    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/api/Registrados")
    public ResponseEntity guardarUsuario(@RequestBody Donantes usuario){
        if(usuario.getIdUsuario() != null){
            return ResponseEntity.badRequest().build();
        }

        repositorio.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PutMapping("/api/Registrados")
    public ResponseEntity actualizarUsuario(@RequestBody Donantes usuario){
        if(usuario.getIdUsuario() == null  || repositorio.existsById(usuario.getIdUsuario())){
            return ResponseEntity.badRequest().build();
        }

        repositorio.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @DeleteMapping("/api/Registrados/{id}")
    public ResponseEntity borrarUsuario(@PathVariable Long id){
        if(id == null || repositorio.existsById(id)){
            return ResponseEntity.badRequest().build();
        }

        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}

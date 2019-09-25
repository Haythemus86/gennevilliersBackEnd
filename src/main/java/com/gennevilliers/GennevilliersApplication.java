package com.gennevilliers;

import com.gennevilliers.com.gennevilliers.dao.EnfantRepository;
import com.gennevilliers.com.gennevilliers.dao.ParentRepository;
import com.gennevilliers.entities.Enfant;
import com.gennevilliers.entities.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GennevilliersApplication implements CommandLineRunner {

    @Autowired
     ParentRepository parentRepository;
    @Autowired
    EnfantRepository  enfantRepository;

    public static void main(String[] args) {
        SpringApplication.run(GennevilliersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Parent haythem = new Parent("barrani","Haythem","67 rue de rome", "i-tem@live.fr",
                "0769022716","000000000",null);

        parentRepository.save(haythem);

        parentRepository.save(new Parent("Naciri","Sanaa","2 rue charles baudelaire", "sanaa@hotmail.fr",
                "0778780222","000000000", null));

        enfantRepository.save(new Enfant("barrani","Leyth",2,"male","aucune", haythem,null));

        List<Parent> listParents = parentRepository.findAll();

        List<Enfant> listEnfant = enfantRepository.findAll();

        for (Parent parent: listParents) {
            System.out.println(parent.getNom());

        }

        for (Enfant enfant : listEnfant ) {
            System.out.println(enfant.getPrenom());
        }




    }
}

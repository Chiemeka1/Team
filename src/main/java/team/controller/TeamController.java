package team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.model.Team;
import team.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/team")
    public List<Team> teamList(){
        return teamRepository.findAll();
    }

    @GetMapping("/team/{id}")
    public Optional<Team> teamById(@PathVariable int  id){
        return teamRepository.findById(id);
    }

    @PostMapping("/team")
    public void teamSave(@RequestBody Team team){
        teamRepository.save(team);
    }

    @DeleteMapping("/teamDeleteById/{id}")
    public void teamDeleteById(@PathVariable int id){
        teamRepository.deleteById(id);
    }

}

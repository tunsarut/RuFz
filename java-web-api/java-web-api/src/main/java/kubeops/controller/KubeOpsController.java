package kubeops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeOpsController {

    @GetMapping
    public String getHelloKubeOps(){
        return "Hello KubeOps";
    }
}

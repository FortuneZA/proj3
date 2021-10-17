//package org.example.controller;
//
//import org.example.entities.JobList;
//import org.example.entities.TruckDriver;
//import org.example.entities.User;
//import org.example.repository.CompaniesRepository;
//import org.example.entities.Companies;
//import org.example.repository.JobListRepository;
//import org.example.repository.UsersRepository;
//import org.example.repository.iTruckDriverRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@org.springframework.stereotype.Controller
//public class AppController {
//
//    @Autowired
//    private CompaniesRepository repository;
//
//    @Autowired
//    private JobListRepository jobListRepository;
//
//    @Autowired
//    private iTruckDriverRepository iTruckDriverRepository;
//
//    Companies cUser;
//    TruckDriver tUser;
//    private CompaniesRepository repository2;
//
//    @GetMapping("/")
//    public String home()
//    {
//        return "Home";
//    }
//
//    @GetMapping("/company-profile")
//    public String view(Model model, Model model2){
//            JobList jobList = new JobList();
//            model.addAttribute("company",repository.getById(cUser.getId()));
//            model2.addAttribute("joblist",jobList);
//            return "company-profile";
//    }
//
//    @GetMapping("/Trucker-Profile")
//    public String view(Model model)
//    {
//        TruckDriver driver = new TruckDriver();
//        model.addAttribute("driver",repository.getById(driver.getId()));
//        return "Trucker-Profile";
//    }
//
//    @GetMapping("/profile")
//    public String profile()
//    {
//        if(cUser != null)
//        {
//            return "redirect:/company-profile";
//        }
//        else if(tUser != null)
//        {
//            return "redirect:/trucker-profile";
//        }
//        else return "redirect:/login";
//    }
//
//    @PostMapping("/process_register")
//    public String processRegistration(Companies companies){
//            companies.setId(cUser.getId());
//            repository.save(companies);
//            return "redirect:/company-profile";
//    }
//
//    @PostMapping("/post-job")
//    public String postJob(JobList jobList)
//    {
//        jobListRepository.save(jobList);
//        return "redirect:/company-profile";
//    }
//
//    @GetMapping("/sign-out")
//    public String signOut()
//    {
//        cUser = null;
//        tUser = null;
//        return "redirect:/login";
//    }
//
//    @PostMapping("/sign-in")
//    public String signIn(Companies companies)
//    {
//        if(repository.existsBycName(companies.getcName()) && repository.existsBypassword(companies.getPassword()))
//        {
//            cUser = repository.findBycName(companies.getcName());
//            return "redirect:/company-profile";
//        }
//        else if(iTruckDriverRepository.existsByemailAddress(companies.getcName()) && iTruckDriverRepository.existsBypassword(companies.getPassword()))
//        {
//            tUser = iTruckDriverRepository.findByemailAddress(companies.getcName());
//            return "redirect:/trucker-profile";
//        }
//        else return "redirect:/login";
//    }
//
//    @GetMapping("/login")
//    public String login(Model model)
//    {
//        Companies companies = new Companies();
//        model.addAttribute("company", companies);
//        if (cUser != null)
//        {
//            return "redirect:/company-profile";
//        }
//        else if(tUser != null)
//        {
//            return "redirect:/trucker-profile";
//        }
//        else
//            return "login";
//    }
//
//    @GetMapping("/create-company")
//    public String createCompany(Model model)
//    {
//        Companies companies = new Companies();
//        model.addAttribute("company",companies);
//        return "createCompany";
//    }
//
//    @PostMapping("/save-company")
//    public String saveCompany(Companies companies)
//    {
//        repository.save(companies);
//        return "redirect:/login";
//    }
//
//    @GetMapping("/create-trucker")
//    public String createTrucker(Model model)
//    {
//        TruckDriver truckDriver = new TruckDriver();
//        model.addAttribute("trucker",truckDriver);
//        return "createTrucker";
//    }
//
//    @PostMapping("/save-trucker")
//    public String saveTrucker(TruckDriver truckDriver)
//    {
//        iTruckDriverRepository.save(truckDriver);
//        return "redirect:/login";
//    }
//
//    @GetMapping("/CoT")
//    public String cot()
//    {
//        return "CorT";
//    }
//
//    @Autowired
//    private UsersRepository repository1;
//
//        @GetMapping("/user-profile")
//        public String view2(Model model){
//            long bub =2;
//            model.addAttribute("user",repository.getById(bub));
//            return "user-profile";
//        }
//
//    @PostMapping("/process_")
//    public String processRegistration(User user){
//            user.setId(1);
//            repository1.save(user);
//            return "register_success";
//    }
//
//}

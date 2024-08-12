//package com.example.it_support.Service;
//
//import com.example.it_support.Enum.EtatEquipement;
//import com.example.it_support.Model.EquipementModel;
//import com.example.it_support.Repository.EquipementRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@SpringBootTest
//class EquipementServiceImplTest {
//
//    @Mock
//    private EquipementRepository equipementRepository;
//
//    @InjectMocks
//    private EquipementServiceImpl equipementService;
//
//    @BeforeEach
//    void setUp(){
//        MockitoAnnotations.openMocks(this);
//    }
//
//
//    @Test
//    void createEquipement() {
//
//        EquipementModel equipementModel = new EquipementModel();
//        equipementModel.setIdequipement(1L);
//        equipementModel.setNom("equip1");
//
//        when(equipementRepository.save(equipementModel)).thenReturn(equipementModel);
//
//        EquipementModel result = equipementService.CreateEquipement(equipementModel);
//
//        assertNotNull(result);
//        assertEquals("equip1" , result.getNom());
//
//    }
//
//    @Test
//    void getAllEquipements() {
//
//        EquipementModel equipementModel1 = new EquipementModel();
//        equipementModel1.setIdequipement(1L);
//        equipementModel1.setNom("you");
//        equipementModel1.setEtatEquipement(EtatEquipement.valueOf("fonctionnel"));
//
//        EquipementModel equipementModel2 = new EquipementModel();
//        equipementModel2.setIdequipement(2L);
//        equipementModel2.setNom("xXx");
//        equipementModel2.setEtatEquipement(EtatEquipement.valueOf("fonctionnel"));
//
//        List<EquipementModel> equipementModelList = Arrays.asList(equipementModel1, equipementModel2);
//
//        when(equipementRepository.findAll()).thenReturn(equipementModelList);
//        List<EquipementModel> result = equipementService.getAllEquipements();
//
//
//        assertEquals(2,result.size());
//        assertEquals("you",result.get(0).getNom());
//        assertEquals("xXx",result.get(1).getNom());
//
//        }
//
//    @Test
//    void deleteEquipements() {
//
//        Long idequipement = 1L ;
//        equipementService.deleteEquipements(idequipement);
//        verify(equipementRepository, times(1)).deleteById(idequipement);
//    }
//
//
////    @Test
////    void updateEquipements() {
////
////        EquipementModel existEquip = new EquipementModel();
////        existEquip.setIdequipement(1L);
////        existEquip.setNom("ExistEquip");
////
////        EquipementModel UpdateEquip = new EquipementModel();
////        UpdateEquip.setIdequipement(1L);
////        UpdateEquip.setNom("UpdateEquip");
////
////        when(equipementRepository.findById(1L)).thenReturn(Optional.of(existEquip));
////        when(equipementRepository.save(existEquip)).thenReturn(UpdateEquip);
////
////        EquipementModel result = equipementService.updateEquipements(UpdateEquip,1L );
////
////        assertNotNull(result);
////        assertEquals("updated Equip", result.getNom());
////    }
//}
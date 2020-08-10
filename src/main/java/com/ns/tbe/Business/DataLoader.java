package com.ns.tbe.Business;

import com.ns.tbe.model.nodes.*;
import com.ns.tbe.model.relationships.*;
import com.ns.tbe.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class DataLoader {
    @Autowired
    MemberRepository memberRepository;

    public boolean saveMember() {
        try {
            //region - create new Member = Rajesh ("TBE001")
            Member member = new Member();
            member.setMemberId("TBE001");
            member.setFirstName("Rajesh");
            member.setLastName("Last");
            member.setDefaultAddress(true);
            member.setHomePhone("999,9999,999");
            member.setWorkPhone("944,4444,445");
            member.setCreatedDate(LocalDateTime.now());
            member.setCreatedBy(Long.valueOf(1));
            member.setRowStatusId(1);

            memberRepository.save(member).block();
            //endregion

            //region - create new Member = Kiran ("TBE002)
            Member member3 = new Member();
            member3.setMemberId("TBE002");
            member3.setFirstName("Kiran");
            member3.setLastName("Last");
            member3.setDefaultAddress(true);
            member3.setHomePhone("999,9999,999");
            member3.setWorkPhone("944,4444,445");
            member3.setCreatedDate(LocalDateTime.now());
            member3.setCreatedBy(Long.valueOf(1));
            member3.setRowStatusId(1);

            memberRepository.save(member3).block();
            //endregion

            //region - create new Member = Harish ("TBE003")
            Member member2 = new Member();
            member2.setMemberId("TBE003");
            member2.setFirstName("Harish");
            member2.setLastName("Last");
            member2.setDefaultAddress(true);
            member2.setHomePhone("999,9999,999");
            member2.setWorkPhone("944,4444,445");
            member2.setCreatedDate(LocalDateTime.now());
            member2.setCreatedBy(Long.valueOf(1));
            member2.setRowStatusId(1);

            Member memberRajesh = memberRepository.findByMemberId("TBE001").block();
            Member memberKiran = memberRepository.findByMemberId("TBE002").block();

            Map<Member, MemberSponsor> memberMemberSponsorMap = new HashMap<>();
            MemberSponsor memberSponsor2 = new MemberSponsor();
            memberSponsor2.setSalesCountry("GBR");
            memberMemberSponsorMap.put(memberKiran, memberSponsor2);

            MemberSponsor memberSponsor = new MemberSponsor();
            memberSponsor.setSalesCountry("USA");
            memberMemberSponsorMap.put(memberRajesh, memberSponsor);

            member2.setMemberSponsor(memberMemberSponsorMap);

            //region - order info
            Map<Order, MemberOrder> memberOrderHashMap = new HashMap<>();
            Order order = new Order();
            order.setOrderNumber("ORD1001");
            order.setSalesCountryId(1);
            order.setMemberId(member2.getId());
            order.setTotalProductVolume(BigDecimal.valueOf(1.33));
            order.setTotalRetailPrice(BigDecimal.valueOf(200.00));

            MemberOrder memberOrder = new MemberOrder();
            memberOrder.setSalesCountry("USA");

            List<OrderLineItem> orderLineItems = new ArrayList<>();
            OrderLineItem orderLineItem1 = new OrderLineItem();
            orderLineItem1.setItemName("Alvera Juice");
            orderLineItem1.setItemNumber("200134");

            orderLineItems.add(orderLineItem1);

            OrderLineItem orderLineItem2 = new OrderLineItem();
            orderLineItem2.setItemName("Gel");
            orderLineItem2.setItemNumber("202455");
            orderLineItems.add(orderLineItem2);

            order.setOrderLineItems(orderLineItems);

            memberOrderHashMap.put(order, memberOrder);

            member2.setMemberOrders(memberOrderHashMap);
            //endregion - Order info

            //region BonusMaster data
            Map<BonusMaster, MemberBonus> bonusBonusPeriodMap = new HashMap<>();
            BonusMaster bonus = new BonusMaster();
            bonus.setProcessingYear(2020);
            bonus.setProcessingMonth(8);
            bonus.setOperatingCompanyId(Long.valueOf(1));
            bonus.setBeginningLevelId(Long.valueOf(1));
            bonus.setEndingLevelId(Long.valueOf(2));

            //region BonusOrderDetail
            Map<BonusOrderDetail, MemberOrderWiseBonus> bonusOrderDetailMemberOrderWiseBonusMap = new HashMap<>();
            BonusOrderDetail bonusOrderDetail = new BonusOrderDetail();
            bonusOrderDetail.setProcessingYear(2020);
            bonusOrderDetail.setProcessingMonth(8);
            bonusOrderDetail.setOrderId(Long.valueOf(10003002));
            bonusOrderDetail.setOrderNumber("ORD1002");

            MemberOrderWiseBonus memberOrderWiseBonus = new MemberOrderWiseBonus();
            memberOrderWiseBonus.setSalesCountry("USA");
            memberOrderWiseBonus.setMemberId("TBE003");
            bonusOrderDetailMemberOrderWiseBonusMap.put(bonusOrderDetail, memberOrderWiseBonus);

            BonusOrderDetail bonusOrderDetail1 = new BonusOrderDetail();
            bonusOrderDetail1.setProcessingYear(2020);
            bonusOrderDetail1.setProcessingMonth(8);
            bonusOrderDetail1.setOrderId(Long.valueOf(10003001));
            bonusOrderDetail1.setOrderNumber("ORD1001");

            MemberOrderWiseBonus memberOrderWiseBonus1 = new MemberOrderWiseBonus();
            memberOrderWiseBonus1.setSalesCountry("USA");
            memberOrderWiseBonus1.setMemberId("TBE003");
            bonusOrderDetailMemberOrderWiseBonusMap.put(bonusOrderDetail1, memberOrderWiseBonus1);
            bonus.setBonusOrderDetails(bonusOrderDetailMemberOrderWiseBonusMap);
            //endregion BonusOrderDetail

            MemberBonus bonusPeriod = new MemberBonus();
            bonusPeriod.setSalesCountry("USA");
            bonusPeriod.setProcessingYear(2020);
            bonusPeriod.setProcessingMonth(7);
            bonusPeriod.setProcessingCycle(1);
            bonusBonusPeriodMap.put(bonus, bonusPeriod);

            member2.setMemberBonus(bonusBonusPeriodMap);
            //endregion BonusMaster data

            //region Bonus Adjustment
            Map<BonusAdjustment, MemberBonusAdjustment> memberBonusAdjustmentMap = new HashMap<>();
            BonusAdjustment bonusAdjustment = new BonusAdjustment();
            bonusAdjustment.setProcessingYear(2020);
            bonusAdjustment.setProcessingMonth(8);
            bonusAdjustment.setOperatingCompanyId(Long.valueOf(1));

            MemberBonusAdjustment memberBonusAdjustment = new MemberBonusAdjustment();
            memberBonusAdjustment.setSalesCountry("USA");
            memberBonusAdjustmentMap.put(bonusAdjustment, memberBonusAdjustment);
            member2.setBonusAdjustments(memberBonusAdjustmentMap);
            //endregion Bonus Adjustment

            //region Bonus History
            Map<BonusHistory, MemberBonus> historyMemberBonusMap = new HashMap<>();
            BonusHistory bonusHistory = new BonusHistory();
            bonusHistory.setProcessingYear(2020);
            bonusHistory.setProcessingMonth(8);

            MemberBonus memberBonus1 = new MemberBonus();
            memberBonus1.setSalesCountry("USA");
            memberBonus1.setProcessingYear(2020);
            memberBonus1.setProcessingMonth(7);
            memberBonus1.setProcessingCycle(1);
            historyMemberBonusMap.put(bonusHistory, memberBonus1);
            member2.setBonusHistory(historyMemberBonusMap);
            //endregion Bonus History

            //region MemberWaiverAndException
            Map<MemberWaiverAndException, WaiverException> memberWaiverAndExceptionWaiverExceptionMap = new HashMap<>();
            MemberWaiverAndException memberWaiverAndException = new MemberWaiverAndException();
            memberWaiverAndException.setProcessingYear(2020);
            memberWaiverAndException.setProcessingMonth(8);

            WaiverException waiverException = new WaiverException();
            waiverException.setSalesCountry("USA");
            memberWaiverAndExceptionWaiverExceptionMap.put(memberWaiverAndException, waiverException);
            member2.setMemberWaiverAndExceptionWaiverExceptionMap(memberWaiverAndExceptionWaiverExceptionMap);
            //endregion MemberWaiverAndException

            memberRepository.save(member2).block();
            //endregion


        } catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }
}

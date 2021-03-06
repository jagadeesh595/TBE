package com.ns.tbe.Business;

import com.ns.tbe.model.nodes.*;
import com.ns.tbe.model.relationships.BonusPeriod;
import com.ns.tbe.model.relationships.MemberSponsor;
import com.ns.tbe.repository.MemberRepository;
import com.ns.tbe.repository.OrderSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class DataLoader {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    OrderSourceRepository orderSourceRepository;

    public boolean saveMember() {
        try {
            OrderSource orderSource = new OrderSource();
            orderSource.setName("Web");
            orderSource.setDescription("Order placed through Web.");
            orderSource.setRowStatusId(1);
            orderSourceRepository.save(orderSource).block();

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
            member.setOperatingCompanyId("USA");

            memberRepository.save(member).block();
            //endregion

            //region - create new Member = Harish ("TBE002")
            Member member2 = new Member();
            member2.setMemberId("TBE002");
            member2.setFirstName("Harish");
            member2.setLastName("Last");
            member2.setDefaultAddress(true);
            member2.setHomePhone("999,9999,999");
            member2.setWorkPhone("944,4444,445");
            member2.setCreatedDate(LocalDateTime.now());
            member2.setCreatedBy(Long.valueOf(1));
            member2.setRowStatusId(1);
            member2.setOperatingCompanyId("GBR");

            Member memberRajesh = memberRepository.findByMemberId("TBE001").block();

            Map<Member, MemberSponsor> memberMemberSponsor1 = new HashMap<>();

            MemberSponsor memberSponsor = new MemberSponsor();
            memberSponsor.setEnrolledDate(LocalDateTime.now());
            memberSponsor.setMemberStatusId(1);
            memberSponsor.setSalesCountry("USA");

            memberMemberSponsor1.put(memberRajesh, memberSponsor);
            member2.setHasSponsor(memberMemberSponsor1);

            //region - order info
            Order order = new Order();
            order.setOrderNumber("ORD1001");
            order.setSalesCountryId(1);
            order.setMemberId(member2.getId());
            order.setTotalProductVolume(BigDecimal.valueOf(1.33));
            order.setTotalRetailPrice(BigDecimal.valueOf(200.00));

            OrderSource orderSource1 = orderSourceRepository.findByName("Web").block();
            order.setOrderSource(orderSource1);
            order.setOrderSourceID(orderSource1.getId());

            List<OrderLineItem> orderLineItems = new ArrayList<>();
            OrderLineItem orderLineItem1 = new OrderLineItem();
            orderLineItem1.setItemName("Alvera Juice");
            orderLineItem1.setItemNumber("200134");

            OrderLineItemHistory orderLineItemHistory = new OrderLineItemHistory();
            orderLineItemHistory.setItemName("Juice");
            orderLineItemHistory.setItemNumber("200134");
            orderLineItem1.setOrderLineItemHistory(Arrays.asList(orderLineItemHistory));

            orderLineItems.add(orderLineItem1);

            OrderLineItem orderLineItem2 = new OrderLineItem();
            orderLineItem2.setItemName("Gel");
            orderLineItem2.setItemNumber("202455");
            orderLineItems.add(orderLineItem2);

            order.setOrderLineItems(orderLineItems);

            Order order1 = new Order();
            order1.setOrderNumber("ORD1002");
            order1.setSalesCountryId(1);
            order1.setMemberId(member2.getId());
            order1.setTotalProductVolume(BigDecimal.valueOf(1.33));
            order1.setTotalRetailPrice(BigDecimal.valueOf(200.00));
            order1.setOrderSourceID(orderSource1.getId());
            order1.setOrderSource(orderSource1);

            List<OrderLineItem> orderLineItems1 = new ArrayList<>();
            OrderLineItem orderLineItem3 = new OrderLineItem();
            orderLineItem3.setItemName("Alvera Juice-second");
            orderLineItem3.setItemNumber("200134");
            orderLineItems1.add(orderLineItem3);

            order.setOrderLineItems(orderLineItems1);

            member2.setHasOrders(Arrays.asList(order,order1));
            //endregion - Order info

            Bonus bonus = new Bonus();
            bonus.setProcessingYear(2020);
            bonus.setProcessingMonth(8);
            bonus.setBusinessEntityId(Long.valueOf(1));
            bonus.setBeginningLevelId(Long.valueOf(1));
            bonus.setEndingLevelId(Long.valueOf(2));

            List<BonusDetail> bonusDetails = new ArrayList<>();
            BonusDetail bonusDetail1 = new BonusDetail();
            bonusDetail1.setBonusComponentId(1);
            bonusDetail1.setBonusVolume(BigDecimal.valueOf(100.00));
            bonusDetails.add(bonusDetail1);

            BonusDetail bonusDetail2 = new BonusDetail();
            bonusDetail2.setBonusComponentId(2);
            bonusDetail2.setBonusVolume(BigDecimal.valueOf(200.00));
            bonusDetails.add(bonusDetail2);

            bonus.setBonusDetails(bonusDetails);

            Map<Bonus, BonusPeriod> bonusBonusPeriodMap = new HashMap<>();
            BonusPeriod bonusPeriod = new BonusPeriod();
            bonusPeriod.setProcessingYear(2020);
            bonusPeriod.setProcessingMonth(7);
            bonusPeriod.setProcessingCycle(1);
            bonusBonusPeriodMap.put(bonus, bonusPeriod);
            member2.setHasBonus(bonusBonusPeriodMap);

            memberRepository.save(member2).block();
            //endregion

            //region - create new Member = Kiran ("TBE003")
            Member member3 = new Member();
            member3.setMemberId("TBE003");
            member3.setFirstName("Kiran");
            member3.setLastName("Last");
            member3.setDefaultAddress(true);
            member3.setHomePhone("999,9999,999");
            member3.setWorkPhone("944,4444,445");
            member3.setCreatedDate(LocalDateTime.now());
            member3.setCreatedBy(Long.valueOf(1));
            member3.setRowStatusId(1);
            member3.setOperatingCompanyId("USA");

            Member memberHarish = memberRepository.findByMemberId("TBE002").block();

            Map<Member, MemberSponsor> memberMemberSponsorMap = new HashMap<>();

            MemberSponsor memberSponsor1 = new MemberSponsor();
            memberSponsor1.setEnrolledDate(LocalDateTime.now());
            memberSponsor1.setMemberStatusId(1);
            memberSponsor1.setSalesCountry("USA");
            memberMemberSponsorMap.put(memberRajesh, memberSponsor1);

            MemberSponsor memberSponsor2 = new MemberSponsor();
            memberSponsor2.setEnrolledDate(LocalDateTime.of(2019, 3, 26, 10, 10));
            memberSponsor2.setMemberStatusId(1);
            memberSponsor2.setSalesCountry("GBR");
            memberMemberSponsorMap.put(memberHarish, memberSponsor2);

            member3.setHasSponsor(memberMemberSponsorMap);

            memberRepository.save(member3).block();
            //endregion

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }
}

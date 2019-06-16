package com.exa.api.entity

import javax.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.validation.constraints.NotNull

@Entity
@Table(name = "books")
class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String kd_buku

    @NotNull
    @Column(nullable = false)
    String nama

    @NotNull
    @Column(nullable = false)
    String isbn

    @NotNull
    @Column(nullable = false)
    String keterangan

    @NotNull
    @Column(nullable = false)
    Integer jumlah
    
    @ManyToOne
    @JoinColumn(name = "kategori_id", referencedColumnName = "id", nullable = true)
    Category category

}
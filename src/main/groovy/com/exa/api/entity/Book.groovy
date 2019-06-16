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
    String kode_buku

    @NotNull
    @Column(nullable = false)
    String judul_buku

    @NotNull
    @Column(nullable = false)
    String no_buku

    @NotNull
    @Column(nullable = false)
    String keterangan_buku

    @NotNull
    @Column(nullable = false)
    Integer stock
    
    @ManyToOne
    @JoinColumn(name = "kategori", referencedColumnName = "id", nullable = true)
    Category category

}